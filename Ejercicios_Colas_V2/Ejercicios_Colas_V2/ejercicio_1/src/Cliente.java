public class Cliente {

    String numeroCuenta;
    String nombreCompleto;
    String tipoTransaccion;
    int montoOperacion;
    Cliente siguiente;

    public Cliente(String numeroCuenta, String nombreCompleto, String tipoTransaccion, int montoOperacion) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCompleto = nombreCompleto;
        this.tipoTransaccion = tipoTransaccion;
        this.montoOperacion = montoOperacion;
        this.siguiente = null;
    }
}
