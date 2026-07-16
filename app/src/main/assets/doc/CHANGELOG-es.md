# v1.0.0

###### 2026/07/16

* `Nuevo` Se agrego el servicio de complemento OCR chino de ML Kit con ID de complemento `mlkit-ocr-chinese`, motor `mlkit-ocr` y variante `chinese`
* `Nuevo` Se agrego descubrimiento e invocacion del host mediante la accion OCR AIDL compartida `org.autojs.plugin.PADDLE_OCR`
* `Nuevo` Se agregaron las interfaces `recognizeText` y `detect`, que devuelven texto reconocido, valores de confianza y limites de lineas de texto
* `Nuevo` Se agrego soporte para entrada de imagen codificada y buferes de imagen sin procesar `ARGB_8888`, con una ruta de lectura SharedMemory preferida en Android 13 y versiones posteriores
* `Nuevo` Se agregaron metadatos del complemento e instrucciones de uso localizados en espanol, frances, ruso, arabe, japones, coreano, ingles, chino simplificado, chino tradicional de Hong Kong y chino tradicional de Taiwan
* `Nuevo` Se agregaron fuentes JSON y generacion `.python/generate_markdown.py` para archivos README y CHANGELOG
* `Nuevo` Se agregaron compilaciones APK separadas por ABI para `arm64-v8a`, `armeabi-v7a`, `x86_64` y un APK `universal`
* `Nuevo` Los nombres de APK de publicacion ahora incluyen la version, la variante ABI y el resumen CRC32
