package Ejercicios_variables_referencia;

public class CopiandoConfiguracion {

    public static void main(String[] args) {
        // 1. Creamos el arreglo de configuración original
        int[] configuracion = {1920, 1080, 60}; // Resolución y FPS

        // 2. Creamos una copia real del arreglo
        int[] copiaConfiguracion = new int[configuracion.length];
        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i]; // Copiamos elemento por elemento
        }

        System.out.println("--- Configuración Original ---");
        System.out.println("Resolución: " + configuracion[0] + "x" + configuracion[1]);
        System.out.println("FPS: " + configuracion[2]);

        // 3. Modificamos la copia
        copiaConfiguracion[0] = 1280; // Cambiamos la resolución a 1280x720
        copiaConfiguracion[1] = 720;
        copiaConfiguracion[2] = 30; // Cambiamos los FPS a 30

        System.out.println("\n--- Configuración Modificada (Copia) ---");
        System.out.println("Resolución: " + copiaConfiguracion[0] + "x" + copiaConfiguracion[1]);
        System.out.println("FPS: " + copiaConfiguracion[2]);

        System.out.println("\n--- Configuración Original Después de Modificar la Copia ---");
        System.out.println("Resolución: " + configuracion[0] + "x" + configuracion[1]);
        System.out.println("FPS: " + configuracion[2]);

        /*
           Al crear 'copiaConfiguracion' como un nuevo arreglo y copiar cada elemento individualmente,
           hemos asegurado que 'copiaConfiguracion' es completamente independiente de 'configuracion'.
           Por lo tanto, cualquier cambio realizado en 'copiaConfiguracion' no afecta a 'configuracion', 
           lo que se demuestra al mostrar ambas configuraciones después de modificar la copia.
           
           En contraste, si hubiéramos hecho una asignación directa como 'int[] copiaConfiguracion = configuracion;',
           ambas variables habrían apuntado al mismo arreglo en memoria, y cualquier cambio a través de 'copiaConfiguracion'
           habría afectado directamente a 'configuracion', ya que ambas referencias apuntarían al mismo objeto.
         */
    }
}
