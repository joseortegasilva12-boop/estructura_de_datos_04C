public class ColaCocina {

    private Orden salida;
    private Orden entrada;

    public ColaCocina() {
        salida = null;
        entrada = null;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Orden nueva) {
        if (isEmpty()) {
            salida = nueva;
            entrada = nueva;
        } else {
            entrada.siguiente = nueva;
            entrada = nueva;
        }
    }

    public Orden dequeue() {
        if (isEmpty()) return null;
        Orden preparada = salida;
        salida = salida.siguiente;
        if (salida == null) entrada = null;
        return preparada;
    }

    public void cerrarServicio() {
        if (isEmpty()) {
            System.out.println("No hay ordenes pendientes.");
            return;
        }
        double totalVentas = 0;
        int totalOrdenes = 0;
        System.out.println("\n--- Cierre de servicio ---");
        while (!isEmpty()) {
            Orden o = dequeue();
            totalOrdenes++;
            totalVentas += o.precioTotal;
            System.out.println("Orden " + o.numeroOrden + " | Mesa: " + o.nombreMesa + " | Plato: " + o.platoPrincipal + " | $" + String.format("%.2f", o.precioTotal));
        }
        System.out.println("\nOrdenes despachadas : " + totalOrdenes);
        System.out.println("Total en ventas     : $" + String.format("%.2f", totalVentas));
    }

    public void mostrarCola() {
        if (isEmpty()) {
            System.out.println("No hay ordenes en cocina.");
            return;
        }
        System.out.print("SALIDA -> ");
        Orden aux = salida;
        while (aux != null) {
            System.out.print("[" + aux.numeroOrden + " | " + aux.nombreMesa + " | " + aux.platoPrincipal + "]");
            if (aux.siguiente != null) System.out.print(" -> ");
            aux = aux.siguiente;
        }
        System.out.println(" -> ENTRADA");
    }
}
