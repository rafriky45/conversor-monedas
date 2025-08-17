¡Perfecto, Rafael! Crear un README es clave para que cualquiera que vea tu proyecto entienda rápidamente de qué se trata y cómo usarlo. Te propongo un **README.md completo y profesional** para tu conversor de monedas, siguiendo buenas prácticas de GitHub:

---

# Conversor de Monedas – Proyecto ONE

## Descripción

Este proyecto es un **conversor de monedas en Java**, diseñado para ejecutarse en consola. Permite convertir entre varias monedas usando la **API de ExchangeRate-API**.
El programa incluye un **menú interactivo**, conversiones rápidas predeterminadas y la posibilidad de realizar **conversiones personalizadas** entre cualquier moneda disponible en la lista.

Monedas disponibles:

* USD – Dólar estadounidense
* ARS – Peso argentino
* BRL – Real brasileño
* COP – Peso colombiano
* CLP – Peso chileno

---

## Funcionalidades

* Menú textual interactivo en consola.
* Conversiones predeterminadas entre Dólar y otras monedas.
* Conversión personalizada entre cualquier par de monedas disponibles.
* Manejo de errores en entrada de usuario y conexión a la API.
* Totalmente modular: `ConversorApp`, `Menu`, `ConversionService`.

---

## Tecnologías utilizadas

* **Java 11+**
* **HttpClient** (Java nativo para llamadas HTTP)
* **Gson** (para parsear JSON)
* **ExchangeRate-API** (para tasas de cambio actualizadas)

---

## Instalación y ejecución

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en **IntelliJ IDEA**.
3. Asegurarse de usar **Java 11 o superior**.
4. Agregar la librería **Gson** al proyecto:

   * Descargar JAR desde [Gson 2.10.1](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar)
   * **File → Project Structure → Libraries → + → Java → seleccionar JAR**
5. Pegar tu **API Key** en `ConversionService.java`:

```java
private static final String API_KEY = "TU_API_KEY_AQUI";
```

6. Ejecutar `ConversorApp.java`.
7. Elegir opciones del menú para convertir monedas.

---

## Uso

* Selecciona una opción del menú escribiendo el número correspondiente.
* Para conversiones personalizadas, selecciona la moneda de origen, luego la de destino, y finalmente ingresa el monto a convertir.
* El programa mostrará el resultado directamente en consola.

---

## Contribuciones

Este proyecto puede ser ampliado agregando nuevas monedas o mejorando la interfaz de usuario. Se aceptan contribuciones siguiendo buenas prácticas de programación en Java.

---

## Autor

**Rafael** – Estudiante y desarrollador junior en Java, enfocado en aprender y practicar buenas estructuras y uso de APIs.

---


