import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaBanco cola = new ColaBanco();
        int opcion;

        do {
            System.out.println("\n===== Banco Nacional =====");
            System.out.println("1. Registrar cliente en fila");
            System.out.println("2. Atender siguiente cliente");
            System.out.println("3. Contar clientes por tipo de transaccion");
            System.out.println("4. Ver fila actual");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Numero de cuenta: ");
                String cuenta = sc.nextLine();
                System.out.print("Nombre completo: ");
                String nombre = sc.nextLine();
                System.out.println("Tipo de transaccion (Deposito / Retiro / Credito / Consulta): ");
                String tipo = sc.nextLine();
                System.out.print("Monto de la operacion: ");
                int monto = sc.nextInt();
                sc.nextLine();
                cola.enqueue(new Cliente(cuenta, nombre, tipo, monto));
                System.out.println("Cliente registrado en la fila.");

            } else if (opcion == 2) {
                Cliente c = cola.dequeue();
                if (c == null) {
                    System.out.println("No hay clientes en espera.");
                } else {
                    System.out.println("\nAtendiendo cliente:");
                    System.out.println("  Cuenta      : " + c.numeroCuenta);
                    System.out.println("  Nombre      : " + c.nombreCompleto);
                    System.out.println("  Transaccion : " + c.tipoTransaccion);
                    System.out.println("  Monto       : $" + c.montoOperacion);
                }

            } else if (opcion == 3) {
                System.out.print("Tipo de transaccion a buscar: ");
                String tipo = sc.nextLine();
                int total = cola.contarPorTransaccion(tipo);
                System.out.println("Clientes esperando por '" + tipo + "': " + total);

            } else if (opcion == 4) {
                cola.mostrarCola();

            } else if (opcion != 0) {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        System.out.println("Sistema cerrado.");
        sc.close();
    }
}
