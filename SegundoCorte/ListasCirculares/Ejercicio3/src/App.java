/*3. Planificador de CPU (Algoritmo Round Robin)
Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador
entre varios procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo
llamado quantum. Si no termina, espera su siguiente turno.
La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y
prioridad (int - del 1 al 3).
El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, descuenta
el quantum del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0 , el
proceso termina y se elimina de la lista.
Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en
cada turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. El ciclo
debe terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los
procesos. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Planificador planificador = new Planificador();
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n====== Planificador Round Robin ======");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar planificador");
            System.out.println("3. Ver procesos en cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre del proceso: ");
                String nombre = scanner.nextLine();
                System.out.print("PID: ");
                int pid = scanner.nextInt();
                System.out.print("Tiempo total (ms): ");
                int tiempo_restante = scanner.nextInt();
                System.out.print("Prioridad (1 al 3): ");
                int prioridad = scanner.nextInt();
                scanner.nextLine();
                planificador.agregar_proceso(nombre, pid, tiempo_restante, prioridad);

            } else if (opcion == 2) {
                System.out.print("Ingresa el quantum (ms): ");
                int quantum = scanner.nextInt();
                scanner.nextLine();
                planificador.ejecutar(quantum);

            } else if (opcion == 3) {
                planificador.mostrar_procesos();

            } else if (opcion == 4) {
                System.out.println("Cerrando el planificador.");

            } else {
                System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }

        scanner.close();
    }
}