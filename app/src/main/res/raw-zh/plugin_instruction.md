ML Kit OCR (Chinese) 通过 AutoJs6 共享 OCR 插件接口提供中文文字识别能力.

插件身份:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

插件使用 Google ML Kit 中文文本识别. `recognizeText` 返回识别文本行, `detect` 返回文本, 置信度和文本行边界框.

它可接收宿主传入的编码图片和 `ARGB_8888` 原始图片缓冲区.
