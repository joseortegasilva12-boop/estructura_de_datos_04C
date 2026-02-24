package Ejercicios_variables_referencia;

public class NotaCurso {
    /*Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de informes 
    apuntan al mismo arreglo .
    -Crea el arreglo stockAlmacencon valores iniciales.
    -Asigna stockReportes = stockAlmacen.
    -Simule una venta reduciendo el stock de un producto desde stockReportes.
    -Muestra que stockAlmacen también cambió y explica en comentarios por qué.
 */
    public static void main(String[] args) {
        //El profesor crea un arreglo con las notas de los estudiantes
        double[] notasProfesor = {4.0, 2.5, 3.5, 4.5}; // Notas de 4 estudiantes

        //El coordinador recibe una referencia al mismo arreglo
        double[] notasCoordinador = notasProfesor;

        System.out.println("--- Estado Inicial ---");
        System.out.println("Notas del Profesor: ");
        for (int i = 0; i < notasProfesor.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notasProfesor[i]);
        }

        //El coordinador corrige la nota del estudiante 2 (índice 1)
        notasCoordinador[1] = 3.0; // Cambiamos la nota del estudiante 2

        System.out.println("\n--- Después de la Corrección ---");
        System.out.println("Notas del Profesor: ");
        for (int i = 0; i < notasProfesor.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notasProfesor[i]);
        }
    }
}
