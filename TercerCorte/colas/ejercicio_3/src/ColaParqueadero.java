public class ColaParqueadero {

    private Carro salida;
    private Carro entrada;
    private static final double TARIFA_HORA = 3500;

    public ColaParqueadero() {
        salida = null;
        entrada = null;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public void enqueue(Carro nuevo) {
        if (isEmpty()) {
            salida = nuevo;
            entrada = nuevo;
        } else {
            entrada.siguiente = nuevo;
            entrada = nuevo;
        }
    }

    public Carro dequeue() {
        if (isEmpty()) return null;
        Carro retirado = salida;
        salida = salida.siguiente;
        if (salida == null) entrada = null;
        return retirado;
    }

    public int calcularHorasTotales() {
        int total = 0;
        Carro aux = salida;
        while (aux != null) {
            total += aux.horasEstacionado;
            aux = aux.siguiente;
        }
        return total;
    }

    public void procesarSalidas() {
        if (isEmpty()) {
            System.out.println("No hay carros esperando salida.");
            return;
        }
        double totalRecaudado = 0;
        int mensuales = 0;
        int porHora = 0;
        System.out.println("\n--- Procesando salidas ---");
        while (!isEmpty()) {
            Carro c = dequeue();
            if (c.esMensual) {
                mensuales++;
                System.out.println("MENSUAL: " + c.placa + " | " + c.propietario + " -> sin cobro adicional");
            } else {
                double cobro = c.horasEstacionado * TARIFA_HORA;
                totalRecaudado += cobro;
                porHora++;
                System.out.println("COBRO: " + c.placa + " | " + c.horasEstacionado + " horas -> $" + String.format("%.0f", cobro));
            }
        }
        System.out.println("\nCarros mensuales   : " + mensuales);
        System.out.println("Carros por hora    : " + porHora);
        System.out.println("Total recaudado    : $" + String.format("%.0f", totalRecaudado));
    }

    public void mostrarCola() {
        if (isEmpty()) {
            System.out.println("El parqueadero esta vacio.");
            return;
        }
        System.out.print("SALIDA -> ");
        Carro aux = salida;
        while (aux != null) {
            System.out.print("[" + aux.placa + " | " + aux.propietario + "]");
            if (aux.siguiente != null) System.out.print(" -> ");
            aux = aux.siguiente;
        }
        System.out.println(" -> ENTRADA");
    }
}
