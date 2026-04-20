# KeyLogger-Java

> ⚠️ **Disclaimer:** Este proyecto ha sido creado única y exclusivamente con fines **educativos** y de **prueba de concepto (PoC)**. El autor no se hace responsable de ningún mal uso, daño o actividad ilegal que se realice con este software. Monitorear sistemas de terceros sin su consentimiento explícito es ilegal.

Un **Keylogger** básico y funcional programado en Java utilizando la librería [JNativeHook](https://github.com/kwhat/jnativehook) para escuchar los eventos del sistema a nivel global.

Diferente a un KeyListener nativo de Swing/AWT, este programa es capaz de capturar las pulsaciones de teclado incluso cuando la aplicación está en segundo plano o minimizada.

## ✨ Características

- 🌍 **Captura global de teclado**: Registra las teclas sin necesidad de que una ventana de Java tenga el foco.
- 💾 **Registro en archivo local**: Las teclas presionadas se guardan automáticamente en un archivo local oculto de manera silenciosa (`admin.txt` en la carpeta `Home` del usuario).
- ⚙️ **Uso de JNativeHook**: Implementación robusta de _Global Hooks_ para sortear las limitaciones estándar de Java con eventos de hardware.
- 🛠️ **Fácil de comprender**: Estructura de código pensada para el aprendizaje sobre interacción a bajo nivel y flujos de entrada/salida (I/O).

## 🛠️ Tecnologías y Librerías

- **Java**: Lenguaje de programación principal.
- **[JNativeHook](https://github.com/kwhat/jnativehook)**: Para los hooks de teclado y ratón a nivel global.
- **Maven/Make**: Estructura de empaquetado y control de dependencias.

## 🚀 Cómo funciona internamente

1. Al ejecutarse `Main.java`, se invoca la clase `FunctionsK`.
2. Se registra el hook llamando a `GlobalScreen.registerNativeHook()`.
3. Se añade un evento de escucha `GlobalScreen.addNativeKeyListener(this)`.
4. Mediante el método `nativeKeyPressed()`, el programa interpreta cada tecla presionada.
5. Se escribe la tecla interceptada (o un string representativo como `[ENTER]`, `[ARROW UP]`) en el archivo `admin.txt` ubicado en el directorio raíz del usuario (`System.getProperty("user.home")`).

## ⚙️ Compilación y Uso

### Prerrequisitos
- Java JDK 8 o superior.
- Git (opcional, para clonar el repositorio).

### Instalación
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/javakl.git

   ```
2. Entra en la carpeta. Haz make, automaticamente se creara el ejecutable. Dale permisos, chmod 777 ./Miproyecto.jar y ejecutalo. Sin permisos no se puede ejecutar. Automaticamente estara en funcionamiento en segundo plano. Todo lo que pulses se guardara en `admin.txt` 


## 🤝 Contribuciones

Este es un proyecto unilateral, me aburria y decidi hacerlo si quieres modificar el proyecto para tu uso te recomiendo saber lo siguiente:

## 🤝 Cosas importantes que debes saber si usas el proyecto

1. las librerias awt y keyhandler de java abriran una ventana que solo guaradara las pulsaciones dentro de esa ventana. Como eso es una mierda use la nativehook para coger todo y poder ejecutar el programa en segundo plano sin que la victima se de cuenta.

2. Proximas actualizaciones en el futuro para poder enviarte info al correo de forma remota o incluso un autostart cuando la victima inicie su pc. Ademas le añadiré permisos de admin automatico para no tener que ejecutar el chmod remotamente.

3. He dejado trozos del codigo del keyhook nativo sueltos y comentados para que quien este aprendiendo pueda modificarlo y usarlo. funciona si no me equivoco desde java 1.4 o java 1.8, ya no me acuerdo, asi que no habra pc con el jdk instalado que se te escape <3

## 📄 Licencia

github: alvalien97