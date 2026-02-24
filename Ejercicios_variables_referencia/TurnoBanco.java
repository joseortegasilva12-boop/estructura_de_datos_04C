package Ejercicios_variables_referencia;

public class TurnoBanco {
    public static void main(String[] args) {
        // 1. Definimos el turno actual del banco
        int turnoActual = 10;
        
        // 2. Asignamos el valor a la variable de la pantalla
        // En Java, al ser un tipo primitivo (int), se copia el VALOR (10)
        // No hay un vínculo entre ambas variables después de esta línea
        int turnoEnPantalla = turnoActual;

        System.out.println("--- Estado Inicial ---");
        System.out.println("Turno Actual en base de datos: " + turnoActual);
        System.out.println("Turno mostrado en Pantalla: " + turnoEnPantalla);

        // 3. Cambiamos el turno en la pantalla (por ejemplo, por un error manual)
        turnoEnPantalla = 25;

        System.out.println("\n--- Después de modificar turnoEnPantalla ---");
        System.out.println("Turno Actual (Original): " + turnoActual); // Sigue siendo 10
        System.out.println("Turno en Pantalla (Modificado): " + turnoEnPantalla);

        /*
           Cuando igualamos 'turnoEnPantalla = turnoActual', Java simplemente toma el número 10
           y lo coloca en el espacio de memoria reservado para 'turnoEnPantalla'. 
           Cualquier cambio posterior en 'turnoEnPantalla' solo afecta a su propia celda de memoria,
           dejando la celda de 'turnoActual' sin cambios.
        */

    }
}