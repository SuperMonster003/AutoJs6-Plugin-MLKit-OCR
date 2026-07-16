ML Kit OCR (Chinese) 는 AutoJs6 공유 OCR 플러그인 인터페이스를 통해 중국어 텍스트 인식을 제공합니다.

플러그인 식별 정보:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

이 플러그인은 Google ML Kit 중국어 텍스트 인식을 사용합니다. `recognizeText` 는 인식된 텍스트 줄을 반환하고 `detect` 는 텍스트, 신뢰도, 줄 경계 상자를 반환합니다.

호스트에서 전달한 인코딩된 이미지 입력과 `ARGB_8888` 원시 이미지 버퍼를 받을 수 있습니다.
