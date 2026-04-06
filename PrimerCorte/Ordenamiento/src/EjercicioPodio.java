
/*1. El Podio de la Competencia
Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar
quiénes ganaron las medallas.
Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participarán (ej. 5 a 10).
Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro
indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar). */

import java.util.Scanner;

public class EjercicioPodio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de corredores (5 a 10): ");
        int numCorredores = scanner.nextInt();

        while (numCorredores < 5 || numCorredores > 10) {
            System.out.print("Número inválido. Ingrese un número entre 5 y 10: ");
            numCorredores = scanner.nextInt();
        }

        double[] tiempos = new double[numCorredores];

        for (int i = 0; i < numCorredores; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + " en segundos: ");
            tiempos[i] = scanner.nextDouble();
        }

        // Ordenamiento por Selección
        for (int i = 0; i < tiempos.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tiempos.length; j++) {
                if (tiempos[j] < tiempos[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar
            double temp = tiempos[minIndex];
            tiempos[minIndex] = tiempos[i];
            tiempos[i] = temp;
        }

        // Imprimir resultados
        System.out.println("\nResultados ordenados:");
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("Corredor " + (i + 1) + ": " + tiempos[i] + " segundos");
        }

        // Mostrar medallas
        if (tiempos.length >= 3) {
            System.out.println("\nMedallas:");
            System.out.println("Oro: Corredor con tiempo " + tiempos[0] + "s");
            System.out.println("Plata: Corredor con tiempo " + tiempos[1] + "s");
            System.out.println("Bronce: Corredor con tiempo " + tiempos[2] + "s");
        } else {
            System.out.println("\nNo hay suficientes corredores para asignar medallas.");
        }

        scanner.close();
    }
}