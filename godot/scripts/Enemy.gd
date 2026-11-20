extends CharacterBody2D
## 敌人/Boss - 移植自 J2ME a.java 实体逻辑

@export var enemy_name: String = "小妖"
@export var max_hp: int = 50
@export var move_speed: float = 50.0
@export var damage: int = 8
@export var is_boss: bool = false

var hp: int = 50
var target: CharacterBody2D = null

func _ready() -> void:
	hp = max_hp

func _physics_process(delta: float) -> void:
	if target == null or not is_instance_valid(target):
		return
	var dir := (target.global_position - global_position)
	if absf(dir.x) > 12:
		velocity.x = signf(dir.x) * move_speed
	else:
		velocity.x = 0
	velocity.y += 900.0 * delta
	move_and_slide()

func take_damage(amount: int) -> void:
	hp -= amount
	flash()
	if hp <= 0:
		die()

func flash() -> void:
	var s := get_node_or_null("Sprite") as Sprite2D
	if s:
		s.modulate = Color.WHITE
		await get_tree().create_timer(0.08).timeout
		if is_instance_valid(s):
			s.modulate = Color(1, 1, 1)

func die() -> void:
	if is_boss:
		EventBus.boss_defeated.emit(enemy_name)
	queue_free()
