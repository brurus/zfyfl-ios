extends Node
## 全局事件总线

signal hp_changed(hp: int, max_hp: int)
signal attack_performed(damage: int)
signal boss_defeated(boss_name: String)
signal level_completed(level_id: int)
signal gold_changed(gold: int)
signal message(text: String)
