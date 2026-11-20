extends CharacterBody2D
## 主角 - 移植自 J2ME e.java 的横版动作逻辑
## 输入层已从 J2ME keyPressed() 映射到 Godot Input / 触屏虚拟按键

signal hp_changed(hp: int, max_hp: int)
signal attack_performed(damage: int)

@export var move_speed: float = 140.0
@export var jump_velocity: float = -320.0
@export var gravity: float = 900.0

var max_hp: int = 100
var hp: int = 100
var attack_power: int = 10      # 原版武器攻击
var magic_power: int = 15       # 原版魔法攻击
var defense: int = 0
var level: int = 1
var exp: int = 0
var gold: int = 0
var kills: int = 0
var weapon_id: int = 0

# 附魔加成（来自 game_data.json）
var enchant_bonuses: Dictionary = {
	"attack": 0.0, "defense": 0.0, "lifesteal": 0.0,
	"magic": 0.0, "luck": 0.0, "exp": 0.0
}

@onready var sprite: Sprite2D = $Sprite
@onready var attack_timer: Timer = $AttackTimer

func _ready() -> void:
	GameData.load_data()
	_equip_weapon(weapon_id)
	hp_changed.emit(hp, max_hp)

func _physics_process(delta: float) -> void:
	# 重力
	if not is_on_floor():
		velocity.y += gravity * delta

	# 跳跃（原版 2 键）
	if Input.is_action_just_pressed("jump") and is_on_floor():
		velocity.y = jump_velocity

	# 水平移动（原版 1/3 斜跳，4/6 跑动）
	var dir := Input.get_axis("move_left", "move_right")
	velocity.x = dir * move_speed

	# 攻击（原版 5 键）/ 魔法（原版 9 键）
	if Input.is_action_just_pressed("attack"):
		perform_attack()
	if Input.is_action_just_pressed("magic"):
		perform_magic()

	move_and_slide()

func _equip_weapon(id: int) -> void:
	weapon_id = id
	var w := GameData.get_weapon(id)
	if not w.is_empty():
		attack_power = w.get("atk_base", 10)

## 伤害计算 - 还原原版 e.java c(int,int) 公式
## case 0: 3x | case 1: x/2 | case 2~4/6: 10x | case 5: x | case 7: 30x | case 8: 50+20x
static func original_damage_formula(case_id: int, x: int) -> int:
	match case_id:
		0: return 3 * x
		1: return x / 2
		2, 3, 4, 6: return 10 * x
		5: return x
		7: return 30 * x
		8: return 50 + 20 * x
		_: return 0

func calc_attack_damage() -> int:
	var bonus: float = enchant_bonuses.get("attack", 0.0)
	var dmg: int = int(attack_power * (1.0 + bonus))
	# 附魔满级彩蛋：究级攻击 case7 = 30x
	if bonus >= 0.5:
		dmg = max(dmg, original_damage_formula(7, attack_power))
	return dmg

func perform_attack() -> void:
	var dmg := calc_attack_damage()
	attack_performed.emit(dmg)

func perform_magic() -> void:
	var bonus: float = enchant_bonuses.get("magic", 0.0)
	var dmg: int = int(magic_power * (1.0 + bonus))
	attack_performed.emit(dmg)

func take_damage(amount: int) -> void:
	var reduced: int = max(1, amount - defense - int(defense * enchant_bonuses.get("defense", 0.0)))
	hp = max(0, hp - reduced)
	hp_changed.emit(hp, max_hp)
	if hp <= 0:
		_die()

func heal(amount: int) -> void:
	hp = min(max_hp, hp + amount)
	hp_changed.emit(hp, max_hp)

func apply_lifesteal(damage: int) -> void:
	var ls: float = enchant_bonuses.get("lifesteal", 0.0)
	if ls > 0.0:
		heal(int(damage * ls))

func gain_exp(amount: int) -> void:
	var bonus: float = enchant_bonuses.get("exp", 0.0)
	exp += int(amount * (1.0 + bonus))
	while exp >= level * 100:
		exp -= level * 100
		level_up()

func level_up() -> void:
	level += 1
	max_hp += 10
	attack_power += 2
	hp = max_hp
	hp_changed.emit(hp, max_hp)

func apply_enchant(id: String) -> bool:
	var e := GameData.get_enchant(id)
	if e.is_empty():
		return false
	var stat: String = e.get("stat", "")
	var bonus: float = float(e.get("bonus", 0.0))
	enchant_bonuses[stat] = enchant_bonuses.get(stat, 0.0) + bonus
	return true

func _die() -> void:
	velocity = Vector2.ZERO
	set_physics_process(false)
