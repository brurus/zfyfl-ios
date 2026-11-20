extends Node
## 游戏数据层 - 直接读取从 J2ME 反编译提取的 JSON

static var data: Dictionary = {}
static var weapons: Array = []
static var enchantments: Array = []
static var bosses: Array = []
static var levels: Array = []

func _ready() -> void:
	load_data()

static func load_data() -> void:
	var path := "res://data/game_data.json"
	var f := FileAccess.open(path, FileAccess.READ)
	if f == null:
		push_error("无法读取游戏数据: " + path)
		return
	var json := JSON.new()
	var err := json.parse(f.get_as_text())
	if err != OK:
		push_error("JSON 解析失败: " + json.get_error_message())
		return
	data = json.data
	weapons = data.get("weapons", [])
	enchantments = data.get("enchantments", [])
	bosses = data.get("bosses", [])
	levels = data.get("levels", [])

static func get_weapon(id: int) -> Dictionary:

	for w in weapons:
		if w.get("id") == id:
			return w
	return {}

static func get_enchant(id: String) -> Dictionary:
	for e in enchantments:
		if e.get("id") == id:
			return e
	return {}

static func get_boss(id: String) -> Dictionary:
	for b in bosses:
		if b.get("id") == id:
			return b
	return {}
