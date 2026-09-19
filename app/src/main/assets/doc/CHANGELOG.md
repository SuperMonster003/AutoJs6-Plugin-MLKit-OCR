******

### 发行历史

******

# v1.0.3

###### 2026/09/19

* `修复` AGP 9.1 构建时的 SDK XML v4 解析警告及 JVM 单元测试组装任务误触发 APK 原生库对齐检查的问题 (共享构建插件 1.8.3)
* `优化` 将 compileSdk 与 targetSdk 提升到 37 (Android 17), 插件行为不受新目标版本影响

# v1.0.2

###### 2026/09/13

* `修复` 插件中心显示的版本与 ABI 信息匹配实际安装的 APK
* `修复` 编码图像最大为 64 MiB, 支持文件描述符和管道传输
* `修复` 版本日期保持统一的英文格式
* `优化` 发布下载文件生成前校验 APK 版本, 签名与完整变体集合
* `优化` 图像最多包含 16777216 个像素, 原始图像缓冲区上限为 64 MiB
* `优化` 扩展原生 ABI 打包与插件元数据至 arm64-v8a, armeabi-v7a, x86 和 x86_64, 同步通用 APK 与各 ABI 独立 APK

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
