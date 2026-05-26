import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaFarmacia cola = new ColaFarmacia();
        int opcion;

        do {
            System.out.println("\n===== Farmacia - Cola de Recetas =====");
            System.out.println("1. Registrar receta");
            System.out.println("2. Despachar siguiente receta");
            System.out.println("3. Ver cuantas requieren formula medica");
            System.out.println("4. Despachar todas las recetas");
            System.out.println("5. Ver cola de recetas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Codigo de receta: ");
                String codigo = sc.nextLine();
                System.out.print("Nombre del paciente: ");
                String paciente = sc.nextLine();
                System.out.print("Medicamento: ");
                String medicamento = sc.nextLine();
                System.out.print("Requiere formula medica? (s/n): ");
                String resp = sc.nextLine();
                boolean formula = resp.equalsIgnoreCase("s");
                cola.enqueue(new Receta(codigo, paciente, medicamento, formula));
                System.out.println("Receta registrada en cola.");

            } else if (opcion == 2) {
                Receta r = cola.dequeue();
                if (r == null) {
                    System.out.println("No hay recetas en espera.");
                } else {
                    System.out.println("\nDespachando receta:");
                    System.out.println("  Codigo      : " + r.codigoReceta);
                    System.out.println("  Paciente    : " + r.paciente);
                    System.out.println("  Medicamento : " + r.medicamento);
                    System.out.println("  Formula     : " + (r.requiereFormula ? "Si" : "No"));
                }

            } else if (opcion == 3) {
                int total = cola.contarConFormula();
                System.out.println("Recetas que requieren formula medica: " + total);

            } else if (opcion == 4) {
                cola.despacharTodo();

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
