# Práctica: Método de Gauss

**Materia:**  Métodos Numéricos, Unidad 3
**Docente:** Víctor Hugo Vásquez Herrera
**Institución:** Instituto Tecnológico Superior de Xalapa
**Alumno:** Andrés Garrido Denisse Itzel 

## Descripción: Implementación del método de Gauss para resolver sistemas de ecuaciones lineales de la forma Ax = b.

El programa sigue un diseño modular, separando la definición de datos, la lógica del método y la clase principal.

## Lenguaje de programación: Java.

## Estructura del proyecto

```
gauss-practica/
├── Ecuaciones_lineales/
│   ├── DefMatriz.java       # Módulo de datos: define la matriz aumentada [A | b]
│   ├── Gauss.java           # Módulo de lógica: eliminación gaussiana y sustitución regresiva
│   └── LanzadorGauss.java   # Clase principal (main)
└── README.md
```

## Cómo compilar y ejecutar: Desde la carpeta raíz del repositorio (la que contiene `Ecuaciones_lineales/`):
**1. Compilar**
```bash
javac Ecuaciones_lineales/*.java
```
**2. Ejecutar**
```bash
java Ecuaciones_lineales.LanzadorGauss
```

## Ejemplo de prueba
Sistema de ecuaciones:
```
3x1   - 0.1x2 - 0.2x3 =   7.85
0.1x1 + 7x2   - 0.3x3 = -19.3
0.3x1 - 0.2x2 + 10x3  =  71.4
```
Matriz aumentada definida en `DefMatriz.java`:

```
|  3.0  -0.1  -0.2 |   7.85 |
|  0.1   7.0  -0.3 | -19.3  |
|  0.3  -0.2  10.0 |  71.4  |
```

**Salida por consola:**

```
Soluciones del sistema:
x1 = 3.0000
x2 = -2.5000
x3 = 7.0000
```

## Funcionamiento

1. `DefMatriz` entrega la matriz aumentada del sistema.
2. `Gauss.eliminacionGaussiana` triangulariza la matriz, haciendo ceros debajo de la diagonal principal.
3. `Gauss.sustitucionRegresiva` despeja las incógnitas de abajo hacia arriba.
4. `LanzadorGauss` coordina el proceso e imprime los resultados.

## Notas

- Si durante la eliminación aparece un pivote igual a cero, el programa lanza un mensaje de error indicando la fila afectada.
- Para resolver otro sistema, basta con modificar la matriz en `DefMatriz.java`.
