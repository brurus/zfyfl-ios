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

## 云端构建（推荐）

仓库：`https://github.com/brurus/zfyfl-ios`

### 方案 A：Codemagic（免费 macOS 分钟，实测可用）

1. 用 GitHub 账号登录 [codemagic.io](https://codemagic.io)，Add application → 选 `brurus/zfyfl-ios`。
2. 构建配置选仓库根目录的 `codemagic.yaml`（已配好 Godot 4.3 + 模板 + 导出 IPA）。
3. 在 Codemagic 项目环境变量里加 `EMAIL`（收构建通知）。
4. 点 Start new build，选 `ios-godot-build` workflow，等 macOS runner 出 IPA。
5. 构建产物在 Artifacts 里下载 `build/zfyfl.ipa`。

### 方案 B：GitHub Actions（需账号有 macOS runner 权限）

`.github/workflows/ios-build.yml` 已配好 `macos-14` runner。
当前 brurus 账号免费额度下 macOS job 会被立即取消（实测 ubuntu runner 正常、macOS 被 cancel），
需升级 GitHub 账号或改用方案 A。

### 签名说明

Godot iOS 导出默认 `export_method=app-store` 且签名身份留空，产出的是**未签名 IPA**（可安装到越狱机或用于验证导出流程）。
要上 TestFlight/App Store 需补：Apple Developer 账号 + 证书 + 描述文件，填入 `export_presets.cfg` 的
`code_signing_identity` / `provisioning_profile_uuid` / `team_id` 三个字段，或在 Codemagic 里配置证书自动签名。

## 本地手动导出（需 Mac）

1. Mac 安装 Godot 4.3 + Xcode。
2. 打开工程 → Project → Export → Add → iOS。
3. 填 Bundle ID 与签名团队。
4. 导出 `.xcodeproj`，Xcode 签名后 Archive → 真机/TestFlight。

## 待办（按优先级）

1. **美术资源**：把 jar 里的 `.mid`（实为自定义精灵格式）转换为 PNG，接入 AnimatedSprite2D。当前用色块占位。
2. **剧情接入**：把 data/*_text.json 的对话接进 UI 系统。
3. **关卡数据**：jar 内 `data/scene/scene_*.mid` 是地图块数据，需写解析器生成 TileMap。
4. **音频**：原版音效在 jar 内，提取后接入 AudioStreamPlayer。
5. **存档**：用 Godot `FileAccess` 替代 J2ME `RecordStore`。

## 说明

- 反编译源码保留在 `src/`，仅供学习 J2ME 游戏架构和玩法逻辑。
- 移植工程是原玩法机制的重新实现，美术与剧情资源需自行处理授权或替换。
