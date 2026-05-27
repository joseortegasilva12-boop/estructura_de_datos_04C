import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCocina cola = new ColaCocina();
        int opcion;

        do {
            System.out.println("\n===== Restaurante - Cola de Cocina =====");
            System.out.println("1. Enviar orden a cocina");
            System.out.println("2. Despachar siguiente orden");
            System.out.println("3. Cerrar servicio del dia");
            System.out.println("4. Ver ordenes en cocina");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Numero de orden: ");
                String numero = sc.nextLine();
                System.out.print("Nombre de la mesa: ");
                String mesa = sc.nextLine();
                System.out.print("Plato principal: ");
                String plato = sc.nextLine();
                System.out.print("Precio total: ");
                double precio = sc.nextDouble();
                sc.nextLine();
                cola.enqueue(new Orden(numero, mesa, plato, precio));
                System.out.println("Orden enviada a cocina.");

            } else if (opcion == 2) {
                Orden o = cola.dequeue();
                if (o == null) {
                    System.out.println("No hay ordenes pendientes.");
                } else {
                    System.out.println("\nDespachando orden:");
                    System.out.println("  Orden  : " + o.numeroOrden);
                    System.out.println("  Mesa   : " + o.nombreMesa);
                    System.out.println("  Plato  : " + o.platoPrincipal);
                    System.out.println("  Total  : $" + String.format("%.2f", o.precioTotal));
                }

            } else if (opcion == 3) {
                cola.cerrarServicio();

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
