/*2. Organización de Biblioteca Dinámica
**Algoritmo obligatorio:** `Ordenamiento por Inserción (Insertion Sort)`

*   **Contexto:** Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante
en su posición correcta.
*   **Detalle del ejercicio:** El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero)
de cada uno.
*   **Lógica de Inserción:** A medida que el usuario ingresa un número, o una vez llenado el arreglo, el algoritmo
debe simular el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
*   **Visualización Paso a Paso:** En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el
arreglo (ej: `[10, 25, 5, 30] -> [5, 10, 25, 30]`). Esto permite al estudiante ver cómo los elementos se desplazan
para abrir espacio al nuevo valor. */

import java.util.Scanner;

public class EjercicioBiblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de libros: ");
        int n = sc.nextInt();
        int[] isbn = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese ISBN: ");
            isbn[i] = sc.nextInt();
            
            // Ordenamiento por Inserción Paso a Paso
            int aux = isbn[i];
            int j = i - 1;
            while (j >= 0 && isbn[j] > aux) {
                isbn[j + 1] = isbn[j];
                j--;
            }
            isbn[j + 1] = aux;
            System.out.println("Estado actual: " + Arrays.toString(Arrays.copyOfRange(isbn, 0, i + 1)));
        }
        System.out.println("ISBN ordenados: " + Arrays.toString(isbn));
    }
}