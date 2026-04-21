// Ejercicio 4 — Galería de Fotos
public class Galeria {
    Foto cabeza;
    Foto cola;
    Foto actual;

    public Galeria() {
        this.cabeza = null;
        this.cola   = null;
        this.actual = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    // Agrega una foto al final del álbum
    public void agregarFoto(String titulo, String fecha, boolean esFavorita) {
        Foto nueva = new Foto(titulo, fecha, esFavorita);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior  = nueva;
            cabeza = nueva;
            cola   = nueva;
            actual = nueva;
        } else {
            cola.siguiente  = nueva;
            nueva.anterior  = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    // Avanza a la foto siguiente
    public void siguiente() {
        if (estaVacia()) {
            System.out.println("  [Galería vacía]");
            return;
        }
        actual = actual.siguiente;
        System.out.println("  [→ Siguiente] Viendo: \"" + actual.titulo + "\"");
    }

    // Retrocede a la foto anterior
    public void anterior() {
        if (estaVacia()) {
            System.out.println("  [Galería vacía]");
            return;
        }
        actual = actual.anterior;
        System.out.println("  [ Anterior] Viendo: \"" + actual.titulo + "\"");
    }

    // Alterna el favorito de la foto actual
    public void toggleFavorita() {
        if (estaVacia()) {
            System.out.println("  [Galería vacía]");
            return;
        }
        actual.esFavorita = !actual.esFavorita;
        System.out.println("  [ Favorita] \"" + actual.titulo + "\" → "
                + (actual.esFavorita ? "marcada como FAVORITA" : "quitada de favoritas"));
    }

    // Elimina la foto actual y mueve el puntero a la siguiente
    public void eliminarActual() {
        if (estaVacia()) {
            System.out.println("  [Galería vacía, nada que eliminar]");
            return;
        }
        System.out.println("  [Eliminando] \"" + actual.titulo + "\"");

        // Si es la única foto
        if (actual.siguiente == actual) {
            cabeza = null;
            cola   = null;
            actual = null;
            return;
        }

        Foto aEliminar = actual;
        // Mover actual ANTES de desconectar
        actual = aEliminar.siguiente;

        // Reconectar vecinos
        aEliminar.anterior.siguiente = aEliminar.siguiente;
        aEliminar.siguiente.anterior = aEliminar.anterior;

        if (aEliminar == cabeza) cabeza = aEliminar.siguiente;
        if (aEliminar == cola)   cola   = aEliminar.anterior;
    }

    // Muestra toda la galería marcando favoritas y la foto actual
    public void mostrarGaleria() {
        if (estaVacia()) {
            System.out.println("  [Galería vacía]");
            return;
        }
        System.out.println("  === Álbum de Fotos ===");
        Foto foto = cabeza;
        int numero = 1;
        do {
            String visor    = (foto == actual)      ? " [>]" : "     ";
            String favorita = foto.esFavorita       ? " [+]" : "     ";
            System.out.println("  " + numero + "." + visor + favorita
                    + " \"" + foto.titulo + "\""
                    + "  (" + foto.fecha + ")");
            foto = foto.siguiente;
            numero++;
        } while (foto != cabeza);
        System.out.println("  (circular => regresa a \"" + cabeza.titulo + "\")");
    }
}
