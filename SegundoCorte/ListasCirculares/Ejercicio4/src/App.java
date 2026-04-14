/*4. Gestión de Mesas en Restaurante (Lista de Espera Circular)
Un restaurante popular tiene un sistema de lista de espera. Cuando una mesa se libera, el
siguiente grupo en espera ocupa el turno y pasa al final del ciclo por si quiere pedir la carta
nuevamente (para clientes VIP).
La Clase Grupo (Nodo): Debe contener nombreReserva (String), numeroDPersonas (int),
esVip (boolean) y minutosEsperando (int).
El Problema: Los grupos normales se atienden y salen de la lista. Los grupos VIP, al ser
atendidos, vuelven al final de la lista circular para una segunda ronda de atención. El sistema
debe atender un grupo por turno.
Reto: Implementa el método atenderSiguiente() que tome el grupo de la cabeza, muestre
su información, y si esVip == true , lo reinserté al final; si no, lo elimine. Muestra el estado
de la lista después de cada atención. Llama al método 6 veces para simular la dinámica del
restaurante.
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n====== Gestion de Mesas ======");
            System.out.println("1. Agregar grupo a la lista de espera");
            System.out.println("2. Atender siguiente grupo");
            System.out.println("3. Ver lista de espera");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre de la reserva: ");
                String nombre_reserva = scanner.nextLine();
                System.out.print("Numero de personas: ");
                int numero_personas = scanner.nextInt();
                System.out.print("Es VIP? (1 = Si, 0 = No): ");
                int vip_input = scanner.nextInt();
                boolean es_vip = vip_input == 1;
                System.out.print("Minutos esperando: ");
                int minutos_esperando = scanner.nextInt();
                scanner.nextLine();
                restaurante.agregar_grupo(nombre_reserva, numero_personas, es_vip, minutos_esperando);

            } else if (opcion == 2) {
                restaurante.atender_siguiente();

            } else if (opcion == 3) {
                restaurante.mostrar_lista();

            } else if (opcion == 4) {
                System.out.println("Cerrando el sistema del restaurante.");

            } else {
                System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }

        scanner.close();
    }
}