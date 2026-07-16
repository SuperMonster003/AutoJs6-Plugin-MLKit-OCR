ML Kit OCR (Chinese) 通過 AutoJs6 共享 OCR 插件接口提供中文文字識別能力.

插件身份:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

插件使用 Google ML Kit 中文文本識別. `recognizeText` 返回識別文本行, `detect` 返回文本, 置信度和文本行邊界框.

它可接收宿主傳入的編碼圖片和 `ARGB_8888` 原始圖片緩衝區.
