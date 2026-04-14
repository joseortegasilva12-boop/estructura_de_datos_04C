/*5. Torneo de Fútbol (Fixture Round Robin)
En un torneo de fútbol por todos contra todos, cada equipo debe enfrentarse exactamente una
vez contra cada uno de los demás equipos. El algoritmo Round Robin fija los partidos rotando los
equipos en un ciclo.
La Clase Equipo (Nodo): Debe contener nombre (String), ciudad (String), puntos (int) y
golesFavor (int).
El Problema: El fixture se genera rotando la lista: en cada jornada, se enfrentan los equipos
opuestos del ciclo (el primero con el último, el segundo con el penúltimo, etc.). Un equipo
queda fijo (la cabeza) y el resto rota una posición hacia adelante en cada jornada.
Reto: Implementa el método generarFixture() que imprima todos los partidos de una
jornada completa para 6 equipos (3 partidos por jornada). Luego, rota los equipos una
posición y repite hasta que todos se hayan enfrentado. Al final, imprime la tabla de
posiciones ordenando los equipos de mayor a menor puntaje (puedes asignar puntos
aleatorios o fijos para la simulación). */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Torneo torneo = new Torneo();
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n====== Torneo de Futbol ======");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Generar fixture completo");
            System.out.println("3. Ver equipos registrados");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre del equipo: ");
                String nombre = scanner.nextLine();
                System.out.print("Ciudad: ");
                String ciudad = scanner.nextLine();
                System.out.print("Puntos iniciales: ");
                int puntos = scanner.nextInt();
                System.out.print("Goles a favor: ");
                int goles_favor = scanner.nextInt();
                scanner.nextLine();
                torneo.agregar_equipo(nombre, ciudad, puntos, goles_favor);

            } else if (opcion == 2) {
                torneo.generar_fixture();

            } else if (opcion == 3) {
                torneo.mostrar_equipos();

            } else if (opcion == 4) {
                System.out.println("Cerrando el sistema del torneo.");

            } else {
                System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }

        scanner.close();
    }
}