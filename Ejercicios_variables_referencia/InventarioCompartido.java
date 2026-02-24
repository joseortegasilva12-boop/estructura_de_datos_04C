package Ejercicios_variables_referencia;

public class InventarioCompartido {
    /*Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de informes apuntan al mismo arreglo .

    -Crea el arreglo stockAlmacencon valores iniciales.
    -Asigna stockReportes = stockAlmacen.
    -Simule una venta reduciendo el stock de un producto desde stockReportes.
    -Muestra que stockAlmacen también cambió y explica en comentarios por qué. */

    public static void main(String[] args) {
        // 1. Creamos el arreglo de stock en el almacén con valores iniciales
        int[] stockAlmacen = {100, 200, 150, 80, 50}; // Stock de 5 productos

        // 2. Asignamos stockReportes al mismo arreglo que stockAlmacen
        int[] stockReportes = stockAlmacen;

        System.out.println("--- Estado Inicial ---");
        System.out.println("Stock en Almacén: ");
        for (int i = 0; i < stockAlmacen.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stockAlmacen[i]);
        }

        // 3. Simulamos una venta reduciendo el stock del producto 2 desde stockReportes
        stockReportes[1] -= 20; // Vendemos 20 unidades del producto 2

        System.out.println("\n--- Después de la Venta ---");
        System.out.println("Stock en Almacén: ");
        for (int i = 0; i < stockAlmacen.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stockAlmacen[i]);
        }

        /*
        Cuando asignamos 'stockReportes = stockAlmacen', no se crea un nuevo arreglo, sino que ambas variables
        apuntan al mismo espacio de memoria donde se encuentra el arreglo original. 
        Por lo tanto, cualquier cambio realizado a través de 'stockReportes' afecta directamente al mismo arreglo
        que 'stockAlmacen' está utilizando. En este caso, al reducir el stock del producto 2 desde 'stockReportes',
        también estamos modificando el contenido del arreglo al que 'stockAlmacen' apunta, lo que se refleja en ambos.
        */
    }
}
