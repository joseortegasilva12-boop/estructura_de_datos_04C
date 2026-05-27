public class ColaAeropuerto {

    private Pasajero salida;
    private Pasajero entrada;

    public ColaAeropuerto() {
        salida = null;
        entrada = null;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Pasajero nuevo) {
        if (isEmpty()) {
            salida = nuevo;
            entrada = nuevo;
        } else {
            entrada.siguiente = nuevo;
            entrada = nuevo;
        }
    }

    public Pasajero dequeue() {
        if (isEmpty()) return null;
        Pasajero abordado = salida;
        salida = salida.siguiente;
        if (salida == null) entrada = null;
        return abordado;
    }

    public int contarPorDestino(String destino) {
        int contador = 0;
        Pasajero aux = salida;
        while (aux != null) {
            if (aux.destino.equalsIgnoreCase(destino)) {
                contador++;
            }
            aux = aux.siguiente;
        }
        return contador;
    }

    public void realizarAbordaje() {
        if (isEmpty()) {
            System.out.println("No hay pasajeros en la fila.");
            return;
        }
        int soloMano = 0;
        int conEquipaje = 0;
        int totalAbordados = 0;
        System.out.println("\n--- Iniciando abordaje ---");
        while (!isEmpty()) {
            Pasajero p = dequeue();
            totalAbordados++;
            if (p.equipajeDeMano) {
                soloMano++;
            } else {
                conEquipaje++;
            }
            System.out.println("Abordando: " + p.nombreCompleto + " | Destino: " + p.destino + " | Pasaporte: " + p.numeroPasaporte);
        }
        System.out.println("\nTotal abordados        : " + totalAbordados);
        System.out.println("Solo equipaje de mano  : " + soloMano);
        System.out.println("Con maleta en bodega   : " + conEquipaje);
    }

    public void mostrarCola() {
        if (isEmpty()) {
            System.out.println("No hay pasajeros en fila.");
            return;
        }
        System.out.print("SALIDA -> ");
        Pasajero aux = salida;
        while (aux != null) {
            System.out.print("[" + aux.nombreCompleto + " | " + aux.destino + "]");
            if (aux.siguiente != null) System.out.print(" -> ");
            aux = aux.siguiente;
        }
        System.out.println(" -> ENTRADA");
    }
}
