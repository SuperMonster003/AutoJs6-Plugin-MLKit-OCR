# v1.0.0

###### 2026/07/16

* `新增` ML Kit 中文 OCR 插件服務, 插件 ID 為 `mlkit-ocr-chinese`, 引擎為 `mlkit-ocr`, 變體為 `chinese`
* `新增` 支援通過共享 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 發現並調用插件
* `新增` 提供 `recognizeText` 和 `detect` 接口, 返回識別文本, 置信度和文本行邊界框
* `新增` 支援編碼圖片輸入和 `ARGB_8888` 原始圖片緩衝區輸入, Android 13 及以上優先嘗試 SharedMemory 讀取
* `新增` 插件資訊和使用說明的多語言資源: 西班牙語/法語/俄語/阿拉伯語/日語/韓語/英語/簡體中文/香港繁體/台灣繁體
* `新增` README 和 CHANGELOG 的 JSON 源文件及 `.python/generate_markdown.py` 生成流程
* `新增` 按 ABI 構建 APK, 包括 `arm64-v8a`/`armeabi-v7a`/`x86_64` 以及 `universal` 通用包
* `新增` 發布 APK 文件名包含版本號, ABI 變體和 CRC32 摘要
