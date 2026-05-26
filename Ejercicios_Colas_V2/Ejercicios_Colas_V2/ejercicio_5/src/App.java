import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaAeropuerto cola = new ColaAeropuerto();
        int opcion;

        do {
            System.out.println("\n===== Aeropuerto - Cola de Abordaje =====");
            System.out.println("1. Registrar pasajero en fila");
            System.out.println("2. Llamar siguiente pasajero");
            System.out.println("3. Contar pasajeros por destino");
            System.out.println("4. Realizar abordaje completo");
            System.out.println("5. Ver fila de abordaje");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Numero de pasaporte: ");
                String pasaporte = sc.nextLine();
                System.out.print("Nombre completo: ");
                String nombre = sc.nextLine();
                System.out.print("Destino: ");
                String destino = sc.nextLine();
                System.out.print("Solo equipaje de mano? (s/n): ");
                String resp = sc.nextLine();
                boolean soloMano = resp.equalsIgnoreCase("s");
                cola.enqueue(new Pasajero(pasaporte, nombre, destino, soloMano));
                System.out.println("Pasajero registrado en fila de abordaje.");

            } else if (opcion == 2) {
                Pasajero p = cola.dequeue();
                if (p == null) {
                    System.out.println("No hay pasajeros en la fila.");
                } else {
                    System.out.println("\nLlamando al pasajero:");
                    System.out.println("  Pasaporte : " + p.numeroPasaporte);
                    System.out.println("  Nombre    : " + p.nombreCompleto);
                    System.out.println("  Destino   : " + p.destino);
                    System.out.println("  Equipaje  : " + (p.equipajeDeMano ? "Solo mano" : "Maleta en bodega"));
                }

            } else if (opcion == 3) {
                System.out.print("Ingresa el destino: ");
                String destino = sc.nextLine();
                int total = cola.contarPorDestino(destino);
                System.out.println("Pasajeros con destino a " + destino + ": " + total);

            } else if (opcion == 4) {
                cola.realizarAbordaje();

            } else if (opcion == 5) {
                cola.mostrarCola();

            } else if (opcion != 0) {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        System.out.println("Sistema cerrado.");
        sc.close();
    }
}
