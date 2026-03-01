package Ejercicios_Input.src;
import java.util.Scanner;
/*### Ejercicio 3 — Promedio de notas
Pide al usuario las notas de 4 asignaturas, calcula el promedio y muestra un mensaje indicando si el estudiante aprobó (promedio >= 3.0) o no.
**Datos de entrada:**
- `String` nombre
- `double` nota1, nota2, nota3, nota4

**Salida esperada:**
```
Estudiante: Carlos
Promedio  : 3.45
Estado    : APROBADO
```

> **Pista:** usa una variable `boolean aprobado = promedio >= 3.0;` para el estado.
*/

public class PromedioNotas {
    public static void main(String[] args) {
        // Aquí puedes implementar el código para el ejercicio
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la nota de la asignatura 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Ingrese la nota de la asignatura 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Ingrese la nota de la asignatura 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Ingrese la nota de la asignatura 4: ");
        double nota4 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        boolean aprobado = promedio >= 3.0;

        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio  : " + promedio);
        System.out.println("Estado    : " + (aprobado ? "APROBADO" : "REPROBADO"));
    }
    
}
