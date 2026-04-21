// Ejercicio 4 — Galería de Fotos
public class Foto {
    String titulo;
    String fecha;
    boolean esFavorita;
    Foto siguiente;
    Foto anterior;

    public Foto(String titulo, String fecha, boolean esFavorita) {
        this.titulo      = titulo;
        this.fecha       = fecha;
        this.esFavorita  = esFavorita;
        this.siguiente   = null;
        this.anterior    = null;
    }
}
