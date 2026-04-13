import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Galeria galeria = new Galeria();

        // -- Agregar fotos --
        System.out.println("=== AGREGAR FOTOS ===");
        System.out.println("Fotos por defecto ya cargadas:");
        System.out.println("  1. vacaciones1.jpg  | 3.5 MB | 1920x1080");
        System.out.println("  2. cumpleanos.png   | 5.2 MB | 4K");
        System.out.println("  3. paisaje.jpg      | 2.8 MB | 1280x720");
        System.out.println("  4. retrato.png      | 4.1 MB | 3840x2160");

        galeria.agregar_foto("vacaciones1.jpg", 3.5, "1920x1080");
        galeria.agregar_foto("cumpleanos.png",  5.2, "4K");
        galeria.agregar_foto("paisaje.jpg",     2.8, "1280x720");
        galeria.agregar_foto("retrato.png",     4.1, "3840x2160");

        System.out.print("\n¿Deseas agregar fotos adicionales? (s/n): ");
        String agregarMas = scanner.nextLine();

        if (agregarMas.equalsIgnoreCase("s")) {
            System.out.print("¿Cuántas fotos deseas agregar? ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= cantidad; i++) {
                System.out.println("\n-- Foto adicional " + i + " --");
                System.out.print("Nombre (ej: foto.jpg) : ");
                String nombre = scanner.nextLine();
                System.out.print("Tamaño en MB         : ");
                double tamanio = Double.parseDouble(scanner.nextLine());
                System.out.print("Resolución           : ");
                String resolucion = scanner.nextLine();
                galeria.agregar_foto(nombre, tamanio, resolucion);
            }
        }

        System.out.println();
        System.out.println("-- Foto actual al inicio --");
        galeria.mostrar_foto_actual();

        // -- Avanzar fotos --
        System.out.println("\n=== AVANZAR FOTOS ===");
        System.out.print("¿Cuántas fotos deseas avanzar? ");
        int avances = Integer.parseInt(scanner.nextLine());

        System.out.println("\n-- Avanzando " + avances + " foto(s) --");
        for (int i = 0; i < avances; i++) {
            galeria.siguiente_foto();
        }

        // -- Retroceder fotos --
        System.out.println("\n=== RETROCEDER FOTOS ===");
        System.out.print("¿Cuántas fotos deseas retroceder? ");
        int retrocesos = Integer.parseInt(scanner.nextLine());

        System.out.println("\n-- Retrocediendo " + retrocesos + " foto(s) --");
        for (int i = 0; i < retrocesos; i++) {
            galeria.foto_anterior();
        }

        // -- Intentar retroceder desde la primera --
        System.out.println("\n=== INTENTAR RETROCEDER DESDE LA PRIMERA ===");
        System.out.print("¿Cuántas veces intentar retroceder desde el inicio? ");
        int intentos = Integer.parseInt(scanner.nextLine());

        System.out.println("\n-- Intentando retroceder " + intentos + " vez/veces desde la primera --");
        for (int i = 0; i < intentos; i++) {
            galeria.foto_anterior();
        }

        // -- Reproducción completa --
        System.out.println("\n-- Reproducción completa de la galería --");
        galeria.reproducir_galeria();

        scanner.close();
    }
}