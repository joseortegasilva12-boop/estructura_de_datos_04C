public class Pasajero {

    String numeroPasaporte;
    String nombreCompleto;
    String destino;
    boolean equipajeDeMano;
    Pasajero siguiente;

    public Pasajero(String numeroPasaporte, String nombreCompleto, String destino, boolean equipajeDeMano) {
        this.numeroPasaporte = numeroPasaporte;
        this.nombreCompleto = nombreCompleto;
        this.destino = destino;
        this.equipajeDeMano = equipajeDeMano;
        this.siguiente = null;
    }
}
