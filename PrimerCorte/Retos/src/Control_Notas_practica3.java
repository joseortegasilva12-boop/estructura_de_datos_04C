/*Ejercicio 3: Control de Notas (Selección)
Objetivo: Gestionar las notas de un grupo, encontrar los valores extremos y ordenar la lista.
¿Qué debes hacer?
1. Entrada: Pide al usuario 5 notas (números decimales) por teclado.
2. Estadísticas: Recorre el arreglo para encontrar cuál es la nota más alta y cuál la más baja del grupo.
3. Ordenamiento: Ordena las notas de menor a mayor usando Selección (Selection Sort).
Ejemplo de lo que se debe ver en consola:
--- REGISTRO DE NOTAS ---
Ingrese nota del Estudiante 1: 3.5
Ingrese nota del Estudiante 2: 4.8
Ingrese nota del Estudiante 3: 2.0
... (hasta completar las 5) ...
--- INFORME ACADÉMICO ---
La nota más ALTA del grupo es: 4.8
La nota más BAJA del grupo es: 2.0
--- LISTA DE NOTAS ORDENADA (Menor a Mayor) ---
[2.0, 3.0, 3.5, 4.2, 4.8]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Control_Notas_practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        System.out.println("Bienvenido al control de notas");
        System.out.println("Ingrese las notas de los 5 estudiantes:");

        // Entrada de datos
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nota del Estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        // Encontrar nota más alta y más baja
        double notaAlta = notas[0];
        double notaBaja = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
            }
        }

        // Mostrar informe académico
        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("La nota más ALTA del grupo es: " + notaAlta);
        System.out.println("La nota más BAJA del grupo es: " + notaBaja);

        // Ordenamiento con Selection Sort
        selectionSort(notas);

        // Mostrar lista de notas ordenada
        System.out.println("\n--- LISTA DE NOTAS ORDENADA (Menor a Mayor) ---");
        System.out.println(Arrays.toString(notas));
    }

    // Selection Sort
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}