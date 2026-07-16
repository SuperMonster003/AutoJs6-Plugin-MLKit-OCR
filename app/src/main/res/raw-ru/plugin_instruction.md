ML Kit OCR (Chinese) предоставляет распознавание китайского текста через общий интерфейс OCR плагинов AutoJs6.

Идентичность плагина:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

Плагин использует распознавание китайского текста Google ML Kit. `recognizeText` возвращает распознанные строки текста, а `detect` возвращает текст, уверенность и границы строк.

Он принимает кодированные изображения и сырые буферы изображений `ARGB_8888` от хоста.
