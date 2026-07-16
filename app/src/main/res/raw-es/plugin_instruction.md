ML Kit OCR (Chinese) proporciona reconocimiento de texto chino mediante la interfaz compartida de complementos OCR de AutoJs6.

Identidad del complemento:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

El complemento usa el reconocimiento de texto chino de Google ML Kit. `recognizeText` devuelve lineas de texto reconocidas, y `detect` devuelve texto, confianza y limites de linea.

Acepta entrada de imagen codificada y buferes de imagen sin procesar `ARGB_8888` desde el host.
