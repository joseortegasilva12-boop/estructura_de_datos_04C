/*Ejercicio 2: Competencia de Atletismo (Inserción)
Objetivo: Ingresar puntajes y organizarlos de mayor a menor para determinar el podio.
¿Qué debes hacer?
1. Entrada: Pide al usuario que ingrese 6 puntajes (números enteros) por teclado.
2. Ordenamiento: Usa Inserción (Insertion Sort) para ordenar los puntajes de mayor a menor.
3. Búsqueda: Pide un puntaje al usuario y búscalo usando Búsqueda Lineal. Indica en qué posición (lugar) de la
tabla quedó.
Ejemplo de lo que se debe ver en consola:
--- INGRESO DE PUNTAJES ---
Puntaje del Intento 1: 85
Puntaje del Intento 2: 98
Puntaje del Intento 3: 70
... (hasta llegar a 6) ...
--- TABLA DE RESULTADOS (De mayor a menor) ---
1° Lugar: 98
2° Lugar: 85
3° Lugar: 70
...
El promedio total de los puntajes fue: 84.3
--- BÚSQUEDA LINEAL ---
Ingrese puntaje a buscar: 85
>> El puntaje 85 se encuentra en el 2° lugar de la tabla
 */

import java.util.Scanner;

public class Competencia_Atletismo_practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] puntajes = new int[6];
        int suma = 0;

        System.out.println("Bienvenido a la competencia de atletismo");
        System.out.println("Ingrese los puntajes de los 6 intentos:");

        // Entrada de datos
        for (int i = 0; i < puntajes.length; i++) {
            System.out.print("Puntaje del Intento " + (i + 1) + ": ");
            puntajes[i] = scanner.nextInt();
            suma += puntajes[i];
        }

        // Ordenamiento con Insertion Sort
        insertionSort(puntajes);

        // Mostrar tabla de resultados
        System.out.println("\n--- TABLA DE RESULTADOS (De mayor a menor) ---");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.println((i + 1) + "° Lugar: " + puntajes[i]);
        }

        // Promedio
        double promedio = (double) suma / puntajes.length;
        System.out.printf("El promedio total de los puntajes fue: %.1f\n", promedio);

        // Búsqueda lineal
        System.out.println("\n--- BÚSQUEDA LINEAL ---");
        System.out.print("Ingrese puntaje a buscar: ");
        int puntajeBusqueda = scanner.nextInt();
        int posicion = busquedaLineal(puntajes, puntajeBusqueda);

        if (posicion != -1) {
            System.out.println(">> El puntaje " + puntajeBusqueda + " se encuentra en el " + (posicion + 1) + "° lugar de la tabla");
        } else {
            System.out.println(">> El puntaje " + puntajeBusqueda + " no se encuentra en la tabla.");
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mover elementos mayores que key a una posición adelante
            while (j >= 0 && arr[j] < key) { // Cambiado para ordenar de mayor a menor
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    // Búsqueda lineal
    public static int busquedaLineal(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Retorna la posición del puntaje encontrado
            }
        }
        return -1; // Retorna -1 si el puntaje no se encuentra
    }
}