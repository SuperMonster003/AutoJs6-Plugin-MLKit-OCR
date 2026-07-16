ML Kit OCR (Chinese) 透過 AutoJs6 共享 OCR 外掛介面提供中文文字辨識能力.

外掛身分:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

外掛使用 Google ML Kit 中文文字辨識. `recognizeText` 回傳辨識文字行, `detect` 回傳文字, 信賴度和文字行邊界框.

它可接收宿主傳入的編碼圖片和 `ARGB_8888` 原始圖片緩衝區.
