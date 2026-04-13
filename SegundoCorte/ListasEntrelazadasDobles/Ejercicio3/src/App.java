import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Navegador navegador = new Navegador();

        // -- Abrir pestañas --
        System.out.println("=== ABRIR PESTAÑAS ===");
        System.out.print("¿Cuántas pestañas deseas abrir? ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\n-- Pestaña " + i + " --");
            System.out.print("Nombre : ");
            String nombre = scanner.nextLine();
            System.out.print("URL    : ");
            String url = scanner.nextLine();
            System.out.print("Hora   : ");
            String hora = scanner.nextLine();
            navegador.abrir_pestana(nombre, url, hora);
        }

        System.out.println();
        navegador.mostrar_pestanas();

        // -- Cerrar pestañas --
        System.out.println("\n=== CERRAR PESTAÑAS ===");

        System.out.println("\n-- Cerrando pestaña intermedia --");
        System.out.print("Ingresa la URL a cerrar: ");
        String urlIntermedia = scanner.nextLine();
        navegador.cerrar_pestana_actual(urlIntermedia);
        navegador.mostrar_pestanas();

        System.out.println("\n-- Cerrando la primera pestaña (cabeza) --");
        System.out.print("Ingresa la URL a cerrar: ");
        String urlCabeza = scanner.nextLine();
        navegador.cerrar_pestana_actual(urlCabeza);
        navegador.mostrar_pestanas();

        System.out.println("\n-- Cerrando la última pestaña (cola) --");
        System.out.print("Ingresa la URL a cerrar: ");
        String urlCola = scanner.nextLine();
        navegador.cerrar_pestana_actual(urlCola);
        navegador.mostrar_pestanas();

        System.out.println("\n-- Intentando cerrar una URL que no existe --");
        System.out.print("Ingresa la URL a cerrar: ");
        String urlInexistente = scanner.nextLine();
        navegador.cerrar_pestana_actual(urlInexistente);

        scanner.close();
    }
}