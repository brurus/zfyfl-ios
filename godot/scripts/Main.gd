extends Node2D
## 主场景 - 关卡加载、HUD、触屏虚拟按键

@onready var player: CharacterBody2D = $Player
@onready var hp_bar: ProgressBar = $CanvasLayer/HPBar
@onready var hp_label: Label = $CanvasLayer/HPLabel
@onready var info_label: Label = $CanvasLayer/InfoLabel
@onready var msg_label: Label = $CanvasLayer/MsgLabel

func _ready() -> void:
	GameData.load_data()
	EventBus.hp_changed.connect(_on_hp_changed)
	EventBus.boss_defeated.connect(_on_boss_defeated)
	EventBus.message.connect(_on_message)
	player.attack_performed.connect(_on_attack)
	# 给所有敌人设置追击目标
	for e in get_tree().get_nodes_in_group("enemies"):
		if "target" in e:
			e.target = player
	_update_hud()
	_show_msg("斩妖伏魔录 · iOS 移植版 | 方向键移动 / 空格跳 / J攻击 / K魔法")

func _on_hp_changed(hp: int, max_hp: int) -> void:
	hp_bar.max_value = max_hp
	hp_bar.value = hp
	hp_label.text = "HP %d/%d" % [hp, max_hp]

func _on_attack(damage: int) -> void:
	# 命中检测：攻击时对所有敌人造成伤害
	for e in get_tree().get_nodes_in_group("enemies"):
		if e.has_method("take_damage") and absf(e.global_position.x - player.global_position.x) < 60:
			e.take_damage(damage)
			player.apply_lifesteal(damage)
			_show_msg("命中 %d 伤害" % damage)

func _on_boss_defeated(name: String) -> void:
	_show_msg("击败头目：%s！" % name)
	var b := GameData.get_boss(_find_boss_id(name))
	player.gold += 1000

func _find_boss_id(name: String) -> String:
	for b in GameData.bosses:
		if b.get("name") == name:
			return b.get("id", "")
	return ""

func _on_message(text: String) -> void:
	_show_msg(text)

func _show_msg(text: String) -> void:
	msg_label.text = text
	await get_tree().create_timer(2.5).timeout
	if is_instance_valid(msg_label) and msg_label.text == text:
		msg_label.text = ""

func _update_hud() -> void:
	info_label.text = "LV.%d  ATK.%d  金币:%d" % [player.level, player.attack_power, player.gold]

func _process(_delta: float) -> void:
	_update_hud()
