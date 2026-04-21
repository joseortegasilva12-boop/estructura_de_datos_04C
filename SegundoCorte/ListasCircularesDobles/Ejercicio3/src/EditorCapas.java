// Ejercicio 3 — Editor de Capas (Diseño Gráfico)
public class EditorCapas {
    Capa cabeza;
    Capa cola;
    Capa capaActiva;

    public EditorCapas() {
        this.cabeza     = null;
        this.cola       = null;
        this.capaActiva = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    // Agrega una capa al final de la pila (la más alta visualmente)
    public void agregarCapa(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior  = nueva;
            cabeza     = nueva;
            cola       = nueva;
            capaActiva = nueva;
        } else {
            cola.siguiente  = nueva;
            nueva.anterior  = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
            // Al agregar, la activa sigue siendo la misma
        }
    }

    // Sube a la capa superior (siguiente en sentido circular)
    public void subirCapa() {
        if (estaVacio()) {
            System.out.println("  [Sin capas]");
            return;
        }
        capaActiva = capaActiva.siguiente;
        System.out.println("  [↑ Subir] Capa activa: " + capaActiva.nombre);
    }

    // Baja a la capa inferior (anterior en sentido circular)
    public void bajarCapa() {
        if (estaVacio()) {
            System.out.println("  [Sin capas]");
            return;
        }
        capaActiva = capaActiva.anterior;
        System.out.println("  [↓ Bajar] Capa activa: " + capaActiva.nombre);
    }

    // Alterna la visibilidad de la capa activa
    public void toggleVisibilidad() {
        if (estaVacio()) {
            System.out.println("  [Sin capas]");
            return;
        }
        capaActiva.visible = !capaActiva.visible;
        System.out.println("  [Visibilidad] \"" + capaActiva.nombre + "\" ahora es: "
                + (capaActiva.visible ? "VISIBLE" : "OCULTA"));
    }

    // Elimina la capa activa; el foco pasa a la siguiente
    public void eliminarActiva() {
        if (estaVacio()) {
            System.out.println("  [Sin capas que eliminar]");
            return;
        }
        System.out.println("  [Eliminando capa] \"" + capaActiva.nombre + "\"");

        // Si es la única capa
        if (capaActiva.siguiente == capaActiva) {
            cabeza     = null;
            cola       = null;
            capaActiva = null;
            return;
        }

        Capa aEliminar = capaActiva;
        // Mover capaActiva ANTES de desconectar
        capaActiva = aEliminar.siguiente;

        // Reconectar vecinos
        aEliminar.anterior.siguiente = aEliminar.siguiente;
        aEliminar.siguiente.anterior = aEliminar.anterior;

        if (aEliminar == cabeza) cabeza = aEliminar.siguiente;
        if (aEliminar == cola)   cola   = aEliminar.anterior;
    }

    // Muestra todas las capas marcando la activa y la visibilidad
    public void mostrarCapas() {
        if (estaVacio()) {
            System.out.println("  [Sin capas en el editor]");
            return;
        }
        System.out.println("  === Capas del Editor (de arriba hacia abajo) ===");
        Capa actual = cabeza;
        int numero = 1;
        do {
            String activa  = (actual == capaActiva) ? " [✓] ACTIVA" : "      ";
            String visib   = actual.visible ? "[VIS]" : "[OC] ";
            System.out.println("  " + numero + ". " + visib
                    + " \"" + actual.nombre + "\""
                    + "  Tipo: " + actual.tipo + activa);
            actual = actual.siguiente;
            numero++;
        } while (actual != cabeza);
        System.out.println("  (circular → regresa a \"" + cabeza.nombre + "\")");
    }
}
