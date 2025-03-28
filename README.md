# Proyecto Java en Visual Studio Code

¡Bienvenido al mundo Java en Visual Studio Code! Este archivo README te guiará para comenzar a escribir código Java y entender mejor la estructura del proyecto y los métodos incluidos.

---

## Estructura del Proyecto

El espacio de trabajo contiene las siguientes carpetas por defecto:

- **`src`**: Carpeta para mantener los archivos fuente.
- **`lib`**: Carpeta para gestionar las dependencias.

Los archivos compilados se generarán automáticamente en la carpeta **`bin`**.

> Si deseas personalizar la estructura de carpetas, abre el archivo **`.vscode/settings.json`** y actualiza las configuraciones relacionadas.

---

## Métodos Incluidos

El proyecto contiene dos métodos principales en los archivos fuente dentro de la carpeta **`src`**:

1. **Método `calcularPromedio`**  
   Este método toma una lista de números enteros como entrada y devuelve el promedio como un número decimal. Es útil para realizar cálculos estadísticos básicos.

   ```java
   public static double calcularPromedio(int[] numeros) {
       int suma = 0;
       for (int numero : numeros) {
           suma += numero;
       }
       return (double) suma / numeros.length;
   }
