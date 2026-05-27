public class ColaFarmacia {

    private Receta salida;
    private Receta entrada;

    public ColaFarmacia() {
        salida = null;
        entrada = null;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Receta nueva) {
        if (isEmpty()) {
            salida = nueva;
            entrada = nueva;
        } else {
            entrada.siguiente = nueva;
            entrada = nueva;
        }
    }

    public Receta dequeue() {
        if (isEmpty()) return null;
        Receta despachada = salida;
        salida = salida.siguiente;
        if (salida == null) entrada = null;
        return despachada;
    }

    public int contarConFormula() {
        int contador = 0;
        Receta aux = salida;
        while (aux != null) {
            if (aux.requiereFormula) {
                contador++;
            }
            aux = aux.siguiente;
        }
        return contador;
    }

    public void despacharTodo() {
        if (isEmpty()) {
            System.out.println("No hay recetas pendientes.");
            return;
        }
        int despachadas = 0;
        int rechazadas = 0;
        System.out.println("\n--- Despachando recetas ---");
        while (!isEmpty()) {
            Receta r = dequeue();
            if (r.requiereFormula) {
                rechazadas++;
                System.out.println("RECHAZADA: " + r.codigoReceta + " | " + r.paciente + " | " + r.medicamento + " -> requiere formula medica");
            } else {
                despachadas++;
                System.out.println("ENTREGADO: " + r.codigoReceta + " | " + r.paciente + " | " + r.medicamento);
            }
        }
        System.out.println("\nRecetas entregadas : " + despachadas);
        System.out.println("Recetas rechazadas : " + rechazadas);
    }

    public void mostrarCola() {
        if (isEmpty()) {
            System.out.println("No hay recetas en espera.");
            return;
        }
        System.out.print("SALIDA -> ");
        Receta aux = salida;
        while (aux != null) {
            System.out.print("[" + aux.codigoReceta + " | " + aux.paciente + " | " + aux.medicamento + "]");
            if (aux.siguiente != null) System.out.print(" -> ");
            aux = aux.siguiente;
        }
        System.out.println(" -> ENTRADA");
    }
}
