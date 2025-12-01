
# 📘 Examen Práctico – Ordenamiento y Búsqueda 

## Enunciado

Se tiene una estructura de datos con:

- Una clase `Universidad`, que contiene un arreglo de `Carrera`.
- Cada `Carrera` contiene un arreglo de `Estudiante`.
- Cada `Estudiante` tiene un nombre y un atributo booleano `matriculado`.



## Diagrama UML

![Diagrama](image.png)


### Objetivo

Implementar los siguientes requerimientos:

1. Calcular cuántos estudiantes **matriculados** tiene cada universidad, escojer la mejor ubicación para el método.
   - **Nota**: Un estudiante se considera matriculado si su atributo `matriculado` es `true`.
2. Implementar y probar los siguientes **métodos de ordenamiento**, usando como criterio la **cantidad total de matriculados por universidad** según la FILA que le tocó:
    | Fila   | Descripción                       | Nombre del método sugerido      |
    |--------|-----------------------------------|---------------------------------|
    | A      | Insertion Sort ascendente         | sortInsertionAsc                |
    | B      | Insertion Sort descendente        | sortInsertionDesc               |
    | C      | Bubble Sort ascendente            | sortBubbleAsc                   |
    | D      | Bubble Sort descendente           | sortBubbleDesc                  |
    | E      | Selection Sort ascendente         | sortSelectionAsc                |
    | F      | Selection Sort descendente        | sortSelectionDesc               |

    NOTA: el nombre del método debe ser el indicado en la tabla, y debe recibir un arreglo de universidades.

```java
public Universidad[] sortInsertionAsc(Universidad[] universidades) {
    // Implementación del método
}
```

3. Implementar un método de **búsqueda binaria** para encontrar una universidad según la **cantidad de estudiantes matriculados**. El método debe recibir como parámetro un valor booleano que indique si el arreglo de universidades fue ordenado de forma ascendente (`true`) o descendente (`false`), y realizar la búsqueda acorde al tipo de orden utilizado.

El nombre del método debe ser `binarySearchByEnrollment` y debe recibir un arreglo de universidades, un número de matriculados y un booleano que indique el orden.

El metodo debera servir para ascendente y descendente, por lo que se debe tener en cuenta el orden de los datos al realizar la busqueda.

Para la immplementación mandar el parametro `isAscending` como `true` si el arreglo fue ordenado de forma ascendente, o `false` si fue ordenado de forma descendent, según el ordenamiento que se haya realizado previamente.

No puede cambiar el nombre del método ni su firma. El método debe retornar la universidad encontrada o `null` si no se encuentra.

```java
public Universidad binarySearchByEnrollment(
    Universidad[] universidades, 
    int enrollments,
    boolean isAscending
    
    ) {
    // Implementación del método
}
```
Cada fila deberá utilizar el método `binarySearchByEnrollment` para buscar dos valores diferentes de estudiantes matriculados, según la siguiente tabla:


### Tabla de criterios de búsqueda por fila 

| Fila | Criterio 1               | Criterio 2              |
| ---- | ------------------------ | ----------------------- |
| A    | 13 matriculados, `true`  | 5 matriculados, `false` |
| B    | 16 matriculados, `false` | 6 matriculados, `true`  |
| C    | 7 matriculados, `true`   | 9 matriculados, `false` |
| D    | 12 matriculados, `false` | 10 matriculados, `true` |
| E    | 16 matriculados, `true`  | 4 matriculados, `false` |
| F    | 13 matriculados, `false` | 99 matriculados, `true` |


## 🧪 Explicación con datos de ejemplo para Datos de Entrada

Estos datos no seran los evaluados, pero sirven para entender el funcionamiento del programa.



El método `createUniversidades()` crea dos universidades:

```java
Universidad A:
  - Ingeniería: Ana (✔️), Luis (✖️)
  - Matemática: María (✔️), Pedro (✔️)
  → Total matriculados: 3

Universidad B:
  - Historia: Lucía (✖️)
  - Física: Carlos (✔️)
  → Total matriculados: 1
````

---

## 📤 Salida Esperada en Consola

```plaintext
Original:
Universidad A - Matriculados: 3
Universidad B - Matriculados: 1

Ordenado por Inserción de menor a mayor:
Universidad B - Matriculados: 1
Universidad A - Matriculados: 3

Buscar Universidad con 3 matriculados que se ordenaron de menor a mayor:
Encontrada: Universidad: Universidad A, Total de matriculados: 3

Buscar Universidad con 2 matriculados que se ordenaron de menor a mayor:
No encontrada
```

---

## ✅ Criterios de Evaluación

| Item      | Descripción                                                            | Puntos        |
| --------- | ---------------------------------------------------------------------- | ------------- |
| ✔️        | Ordenamiento                                                           | 2 pts         |
| ✔️        | Implementación de búsqueda binaria por número de matriculados          | 3 pts         |
| ✔️        | Salida por consola clara y completa según ejemplo                      | 1 pts         |
| **Total** |                                                                        | **6 puntos** |


## ℹ️ Nota para estudiantes
* Si los metodos tienen otros nombres, tendran la mitad de los puntos.
* El objetivo no es solo que funcione, sino que el **resultado sea visible en consola**, organizado y explicativo.
* Se recomienda imprimir también los nombres de los métodos utilizados en cada sección del output para mayor claridad.




