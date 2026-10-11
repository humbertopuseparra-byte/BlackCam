# BlackCam — prototipo Android

Proyecto Android Studio en Kotlin (Android 8+, API 26). Graba video MP4 con audio mediante CameraX, usa una pantalla negra **dentro de la aplicación** y mantiene la grabación mediante un servicio en primer plano con notificación visible.

## Compilar
1. Instalar Android Studio con Android SDK 35 y JDK 17.
2. Abrir esta carpeta (`BlackCam`) como proyecto.
3. Esperar sincronización Gradle (requiere internet para descargar dependencias).
4. Build > Build APK(s). El APK de depuración estará en `app/build/outputs/apk/debug/`.
5. Instalarlo en el Motorola Moto G54 5G, conceder permisos y probar una grabación corta.

## Uso
Iniciar grabación con la aplicación visible. Activar pantalla negra para sustituir los controles por fondo negro (la pantalla sigue encendida). Puedes ir a otra aplicación y detener desde la notificación persistente. Los MP4 se guardan en `Movies/BlackCam`.

## Límites y advertencias
- No oculta indicadores de privacidad ni notificaciones del sistema.
- No garantiza grabación con pantalla físicamente apagada o teléfono bloqueado: depende de Android y del fabricante.
- Algunas versiones de Android limitan el uso de cámara/micrófono en segundo plano; iniciar siempre desde la app visible.
- La cámara frontal se selecciona antes de iniciar, no durante la grabación.
- Es una primera implementación **no compilada ni probada en dispositivo**. Verificar permisos, duración, batería, temperatura y grabación interrumpida antes de confiar en ella.
- No hay grabación secreta: usar solo con consentimiento y de acuerdo con la ley aplicable.

## Compilar en GitHub Actions desde el celular
1. Crea un repositorio **privado** en GitHub.
2. Sube el **contenido** de la carpeta BlackCam a la raíz del repositorio, incluyendo `.github/workflows/build-apk.yml` (no subas el ZIP sin descomprimir).
3. Abre la pestaña Actions, selecciona «Compilar BlackCam APK» y pulsa «Run workflow» (si no aparece, realiza un push a main).
4. Cuando termine con éxito, entra en la ejecución y descarga el artefacto «BlackCam-debug-apk». Descomprímelo y abre `app-debug.apk` para instalarlo.
5. Si falla la compilación, comparte el mensaje de error. **No se ha verificado aún la compilación ni el funcionamiento.**
