import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaParqueadero cola = new ColaParqueadero();
        int opcion;

        do {
            System.out.println("\n===== Parqueadero Central =====");
            System.out.println("1. Registrar carro en fila de salida");
            System.out.println("2. Procesar siguiente carro");
            System.out.println("3. Ver horas totales en espera");
            System.out.println("4. Procesar todas las salidas");
            System.out.println("5. Ver fila de salida");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Propietario: ");
                String propietario = sc.nextLine();
                System.out.print("Horas estacionado: ");
                int horas = sc.nextInt();
                sc.nextLine();
                System.out.print("Es mensual? (s/n): ");
                String resp = sc.nextLine();
                boolean mensual = resp.equalsIgnoreCase("s");
                cola.enqueue(new Carro(placa, propietario, horas, mensual));
                System.out.println("Carro registrado en fila de salida.");

            } else if (opcion == 2) {
                Carro c = cola.dequeue();
                if (c == null) {
                    System.out.println("No hay carros en espera.");
                } else {
                    System.out.println("\nProcesando carro:");
                    System.out.println("  Placa       : " + c.placa);
                    System.out.println("  Propietario : " + c.propietario);
                    System.out.println("  Horas       : " + c.horasEstacionado);
                    System.out.println("  Mensual     : " + (c.esMensual ? "Si" : "No"));
                }

            } else if (opcion == 3) {
                int horas = cola.calcularHorasTotales();
                System.out.println("Horas totales acumuladas en fila: " + horas);

            } else if (opcion == 4) {
                cola.procesarSalidas();

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
