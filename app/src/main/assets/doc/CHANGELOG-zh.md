# v1.0.0

###### 2026/07/16

* `新增` ML Kit 中文 OCR 插件服务, 插件 ID 为 `mlkit-ocr-chinese`, 引擎为 `mlkit-ocr`, 变体为 `chinese`
* `新增` 支持通过共享 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 发现并调用插件
* `新增` 提供 `recognizeText` 和 `detect` 接口, 返回识别文本, 置信度和文本行边界框
* `新增` 支持编码图片输入和 `ARGB_8888` 原始图片缓冲区输入, Android 13 及以上优先尝试 SharedMemory 读取
* `新增` 插件信息和使用说明的多语言资源: 西班牙语/法语/俄语/阿拉伯语/日语/韩语/英语/简体中文/香港繁体/台湾繁体
* `新增` README 和 CHANGELOG 的 JSON 源文件及 `.python/generate_markdown.py` 生成流程
* `新增` 按 ABI 构建 APK, 包括 `arm64-v8a`/`armeabi-v7a`/`x86_64` 以及 `universal` 通用包
* `新增` 发布 APK 文件名包含版本号, ABI 变体和 CRC32 摘要
