<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>基于 Google ML Kit 的中文 OCR</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### 语言 (Languages)

******

当前 README.md 支持以下语言:

- 简体中文 [zh-Hans] # 当前
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### 简介

******

AutoJs6 ML Kit OCR 插件为 AutoJs6 提供基于 Google ML Kit 的中文文字识别能力, 可返回识别文本行, 置信度和边界框信息.

******

### 功能

******

- 提供共享 OCR 插件服务, 插件 ID 为 `mlkit-ocr-chinese`, 引擎为 `mlkit-ocr`, 变体为 `chinese`.
- 通过 `org.autojs.plugin.PADDLE_OCR` 暴露 OCR AIDL 接口, 兼容 AutoJs6 宿主侧 OCR 插件发现机制.
- 支持 `recognizeText` 返回文本行列表, 支持 `detect` 返回文本, 置信度和文本行边界框.
- 支持编码图片输入和 `ARGB_8888` 原始图片缓冲区输入.
- 插件信息, 使用说明, README 与 CHANGELOG 均支持西班牙语/法语/俄语/阿拉伯语/日语/韩语/英语/简体中文/香港繁体/台湾繁体.
- 基于 `com.google.mlkit:text-recognition-chinese`.
- 图像最多包含 16777216 个像素, 原始图像缓冲区上限为 64 MiB

******

### 插件接口

******

宿主可通过以下身份发现并调用插件:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` 返回字符串列表; `detect` 返回 OCR 结果列表, 每项包含 `text`, `confidence` 和 `bounds`.

******

### 发行历史

******

# v1.0.2

###### 2026/09/13

* `修复` 插件中心显示的版本与 ABI 信息匹配实际安装的 APK
* `优化` 发布下载文件生成前校验 APK 版本, 签名与完整变体集合
* `优化` 图像最多包含 16777216 个像素, 原始图像缓冲区上限为 64 MiB

# v1.0.1

###### 2026/09/11

* `优化` 构建阶段校验 64 位原生库的 16 KB 页大小对齐, 检查 manifest 契约并输出 JSON 报告

# v1.0.0

###### 2026/09/01

* `新增` ML Kit 中文 OCR 插件服务, 插件 ID 为 `mlkit-ocr-chinese`, 引擎为 `mlkit-ocr`, 变体为 `chinese`
* `新增` 支持通过共享 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 发现并调用插件
* `新增` 提供 `recognizeText` 和 `detect` 接口, 返回识别文本, 置信度和文本行边界框
* `新增` 支持编码图片输入和 `ARGB_8888` 原始图片缓冲区输入, Android 13 及以上优先尝试 SharedMemory 读取
* `新增` 插件信息和使用说明的多语言资源: 西班牙语/法语/俄语/阿拉伯语/日语/韩语/英语/简体中文/香港繁体/台湾繁体
* `新增` README 和 CHANGELOG 的 JSON 源文件及 `.python/generate_markdown.py` 生成流程
* `新增` 按 ABI 构建 APK, 包括 `arm64-v8a`/`armeabi-v7a`/`x86_64` 以及 `universal` 通用包
* `新增` 发布 APK 文件名包含版本号, ABI 变体和 CRC32 摘要
* `优化` 统一 README 版式与 Gradle 平台版本管理方式
* `优化` 精简插件描述并规范多语言资源中的标点符号

##### 更多发行历史可参阅

* [CHANGELOG-zh-Hans.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-zh-Hans.md)

******

### 构建

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release 构建:

```powershell
.\gradlew.bat :app:assembleRelease
```

构建参数来自 `version.properties`, 当前最低 SDK 为 24, 目标 SDK 为 36.

******

### 资源结构

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` 提供插件描述本地化; `plugin_instruction.md` 提供宿主侧展示的插件使用说明. README 与 CHANGELOG 由 `.python/generate_markdown.py` 根据 JSON 源文件生成.

******

### 相关链接

******

- AutoJs6 文档: https://docs.autojs6.com
- Google ML Kit 文本识别文档: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
