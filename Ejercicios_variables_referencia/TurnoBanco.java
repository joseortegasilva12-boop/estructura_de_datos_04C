package Ejercicios_variables_referencia;

public class TurnoBanco {
    /*Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActualy se asigna a
    turnoEnPantalla.
    Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual(comportamiento por valor).
    Explique en un comentario por qué ocurre esto.
 */
    public static void main(String[] args) {
        //turno actual del banco
        int turnoActual = 10;
        
        //Asignamos el valor a la variable 
        int turnoEnPantalla = turnoActual;

        System.out.println("--- Estado Inicial ---");
        System.out.println("Turno Actual en base de datos: " + turnoActual);
        System.out.println("Turno mostrado en Pantalla: " + turnoEnPantalla);

        //Cambiamos el turno en la pantalla (por ejemplo, por un error manual)
        turnoEnPantalla = 25;

        System.out.println("\n--- Después de modificar turnoEnPantalla ---");
        System.out.println("Turno Actual (Original): " + turnoActual); // Sigue siendo 10
        System.out.println("Turno en Pantalla (Modificado): " + turnoEnPantalla);
    }
}