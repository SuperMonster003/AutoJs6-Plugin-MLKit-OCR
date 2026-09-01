******

### 發行歷史

******

# v1.0.0

###### 2026/09/01

* `新增` ML Kit 中文 OCR 外掛服務, 外掛 ID 為 `mlkit-ocr-chinese`, 引擎為 `mlkit-ocr`, 變體為 `chinese`
* `新增` 支援透過共享 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 探索並呼叫外掛
* `新增` 提供 `recognizeText` 和 `detect` 介面, 回傳辨識文字, 信賴度和文字行邊界框
* `新增` 支援編碼圖片輸入和 `ARGB_8888` 原始圖片緩衝區輸入, Android 13 及以上優先嘗試 SharedMemory 讀取
* `新增` 外掛資訊和使用說明的多語言資源: 西班牙文/法文/俄文/阿拉伯文/日文/韓文/英文/簡體中文/香港繁體/台灣繁體
* `新增` README 和 CHANGELOG 的 JSON 來源檔及 `.python/generate_markdown.py` 產生流程
* `新增` 按 ABI 建置 APK, 包括 `arm64-v8a`/`armeabi-v7a`/`x86_64` 以及 `universal` 通用包
* `新增` 發布 APK 檔名包含版本號, ABI 變體和 CRC32 摘要
* `最佳化` 統一 README 版式與 Gradle 平台版本管理方式
* `最佳化` 精簡外掛描述並規範多語言資源中的標點符號
