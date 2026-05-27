public class ColaBanco {

    private Cliente salida;
    private Cliente entrada;

    public ColaBanco() {
        salida = null;
        entrada = null;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Cliente nuevo) {
        if (isEmpty()) {
            salida = nuevo;
            entrada = nuevo;
        } else {
            entrada.siguiente = nuevo;
            entrada = nuevo;
        }
    }

    public Cliente dequeue() {
        if (isEmpty()) return null;
        Cliente atendido = salida;
        salida = salida.siguiente;
        if (salida == null) entrada = null;
        return atendido;
    }

    public int contarPorTransaccion(String tipo) {
        int contador = 0;
        Cliente aux = salida;
        while (aux != null) {
            if (aux.tipoTransaccion.equalsIgnoreCase(tipo)) {
                contador++;
            }
            aux = aux.siguiente;
        }
        return contador;
    }

    public void mostrarCola() {
        if (isEmpty()) {
            System.out.println("No hay clientes en espera.");
            return;
        }
        System.out.print("SALIDA -> ");
        Cliente aux = salida;
        while (aux != null) {
            System.out.print("[" + aux.nombreCompleto + " | " + aux.tipoTransaccion + "]");
            if (aux.siguiente != null) System.out.print(" -> ");
            aux = aux.siguiente;
        }
        System.out.println(" -> ENTRADA");
    }
}
