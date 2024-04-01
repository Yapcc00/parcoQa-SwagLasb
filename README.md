<h1># Automatización Web para Swag Labs</h1>

```markdown

Este proyecto proporciona una automatización de pruebas para el sitio web [Swag Labs](https://www.saucedemo.com/) utilizando Selenium WebDriver. El objetivo principal es automatizar el proceso de inicio de sesión y la funcionalidad de agregar productos al carrito de compra.

## Requisitos

Para ejecutar este proyecto, necesitarás:

- Java JDK (versión 8 o superior)
- Gradle para la gestión de dependencias
- WebDriver para Firefox (GeckoDriver) o Chrome (ChromeDriver), dependiendo del navegador que prefieras usar.

## Configuración

Antes de ejecutar el proyecto, es importante asegurar que todas las dependencias estén actualizadas. Esto se puede hacer ejecutando el siguiente comando en la terminal:

```
bash
gradle build

```

## Navegadores Soportados

Este proyecto está configurado para usar Firefox por defecto, pero se puede adaptar fácilmente para trabajar con Chrome o cualquier otro navegador soportado por Selenium.

### Firefox

Para usar Firefox, asegúrate de tener GeckoDriver instalado y correctamente configurado en tu PATH.

### Chrome

Si prefieres usar Chrome, deberás descargar ChromeDriver y también asegurarte de que esté configurado en tu PATH. Para cambiar el proyecto a Chrome, modifica la configuración del WebDriver en el código fuente.

## Ejecución

Para ejecutar las pruebas, puedes usar el siguiente comando en la terminal:

```bash
gradle test
```

## Contribuir

Si deseas contribuir a este proyecto, por favor, envía un pull request con tus cambios para revisión.

```
