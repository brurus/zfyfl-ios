# 斩妖伏魔录 · iOS 移植工程

## 当前状态

Godot 4.3 工程已通过 headless 校验和 90 帧运行测试，无脚本错误。

## 目录结构

```
zfyfl/
├── jars/              4 部 J2ME 本体（前传+1+2+3）
├── src/               反编译出的 85 个 Java 源文件（CFR 0.152）
├── data/              提取的中文文案（2773 条，4 部）
├── tools/             便携 JRE 8 + CFR + Godot 4.3
└── godot/             ★ iOS 移植工程（可运行）
    ├── project.godot
    ├── scenes/Main.tscn
    ├── scripts/       GameData / Player / Enemy / Main / EventBus
    └── data/game_data.json  武器/附魔/Boss/关卡数据
```

## 从反编译到移植的映射

| 原版 (J2ME) | 移植 (Godot) | 状态 |
|---|---|---|
| `GameMIDlet.java` | project.godot 入口 | 完成 |
| `c.java` (Canvas 主循环) | Main.gd + _physics_process | 完成 |
| `e.java` (核心逻辑, 382KB) | Player.gd / Enemy.gd | 框架完成 |
| `e.java c(int,int)` 伤害公式 | Player.gd `original_damage_formula()` | 完整还原 |
| 附魔/武器/关卡数据 | data/game_data.json | 数据提取完成 |
| keyPressed (1/3/4/6/2/5/9) | Godot Input + 触屏 | 完成 |
| `.mid` 精灵/场景资源 | 待转换（PNG 序列） | 未做 |
| 剧情文本 a/*.java | data/*_text.json | 已导出，未接入 |

## 本地运行

```bash
cd E:/WorkBuddy/2026-11-20-13-46-33/zfyfl/godot
../tools/godot/Godot_v4.3-stable_win64_console.exe --path .
```

操作：方向键移动 / 空格跳 / J 攻击 / K 魔法。

## iOS 导出（需 macOS + Xcode）

1. 在 Mac 上安装 Godot 4.3 + Xcode。
2. 打开工程 → Project → Export → Add → iOS。
3. 填写 Bundle ID（如 `com.yourname.zfyfl`）和签名团队。
4. 导出 `.xcodeproj`，用 Xcode 签名后 Archive → 真机运行或 TestFlight。
5. 无 Mac 时用云构建（如 iOSForge / MacinCloud / GitHub Actions macOS runner）跑同一导出流程。

## 待办（按优先级）

1. **美术资源**：把 jar 里的 `.mid`（实为自定义精灵格式）转换为 PNG，接入 AnimatedSprite2D。当前用色块占位。
2. **剧情接入**：把 data/*_text.json 的对话接进 UI 系统。
3. **关卡数据**：jar 内 `data/scene/scene_*.mid` 是地图块数据，需写解析器生成 TileMap。
4. **音频**：原版音效在 jar 内，提取后接入 AudioStreamPlayer。
5. **存档**：用 Godot `FileAccess` 替代 J2ME `RecordStore`。

## 说明

- 反编译源码保留在 `src/`，仅供学习 J2ME 游戏架构和玩法逻辑。
- 移植工程是原玩法机制的重新实现，美术与剧情资源需自行处理授权或替换。
