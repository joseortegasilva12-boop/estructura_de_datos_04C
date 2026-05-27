public class Orden {

    String numeroOrden;
    String nombreMesa;
    String platoPrincipal;
    double precioTotal;
    Orden siguiente;

    public Orden(String numeroOrden, String nombreMesa, String platoPrincipal, double precioTotal) {
        this.numeroOrden = numeroOrden;
        this.nombreMesa = nombreMesa;
        this.platoPrincipal = platoPrincipal;
        this.precioTotal = precioTotal;
        this.siguiente = null;
    }
}
