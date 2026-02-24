package Ejercicios_variables_referencia;

public class CopiandoConfiguracion {
    /*Una aplicación tiene un objeto int[] configuracion = {1920, 1080, 60}(resolución y FPS).

    -Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
    -Modifica la copia y demuestra que el original no cambia .
    -Comenta la diferencia con la asignación directa. */

    public static void main(String[] args) {
        //Creamos el arreglo de configuración original
        int[] configuracion = {1920, 1080, 60}; // Resolución y FPS

        //Creamos una copia real del arreglo
        int[] copiaConfiguracion = new int[configuracion.length];
        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i]; // Copiamos elemento por elemento
        }

        System.out.println("--- Configuración Original ---");
        System.out.println("Resolución: " + configuracion[0] + "x" + configuracion[1]);
        System.out.println("FPS: " + configuracion[2]);

        //Modificamos la copia
        copiaConfiguracion[0] = 1280; // Cambiamos la resolución a 1280x720
        copiaConfiguracion[1] = 720;
        copiaConfiguracion[2] = 30; // Cambiamos los FPS a 30

        System.out.println("\n--- Configuración Modificada (Copia) ---");
        System.out.println("Resolución: " + copiaConfiguracion[0] + "x" + copiaConfiguracion[1]);
        System.out.println("FPS: " + copiaConfiguracion[2]);

        System.out.println("\n--- Configuración Original Después de Modificar la Copia ---");
        System.out.println("Resolución: " + configuracion[0] + "x" + configuracion[1]);
        System.out.println("FPS: " + configuracion[2]);
    }
}
