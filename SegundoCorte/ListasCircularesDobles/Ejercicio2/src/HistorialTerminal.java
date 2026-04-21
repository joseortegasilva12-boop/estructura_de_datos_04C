// Ejercicio 2 — Historial de Comandos de Terminal
public class HistorialTerminal {
    Comando cabeza;
    Comando cola;
    Comando cursor;

    public HistorialTerminal() {
        this.cabeza = null;
        this.cola   = null;
        this.cursor = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    // Agrega un comando al final (el más reciente va al final)
    public void agregar(String texto, boolean exitoso, String directorio) {
        Comando nuevo = new Comando(texto, exitoso, directorio);
        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior  = nuevo;
            cabeza = nuevo;
            cola   = nuevo;
        } else {
            cola.siguiente  = nuevo;
            nuevo.anterior  = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
        // El cursor siempre apunta al más reciente al agregar
        cursor = cola;
    }

    // Flecha arriba: retrocede al comando anterior
    public void arriba() {
        if (estaVacio()) {
            System.out.println("  [Historial vacío]");
            return;
        }
        cursor = cursor.anterior;
        System.out.println("  [↑ Arriba] Comando actual: " + cursor.texto);
    }

    // Flecha abajo: avanza al comando siguiente
    public void abajo() {
        if (estaVacio()) {
            System.out.println("  [Historial vacío]");
            return;
        }
        cursor = cursor.siguiente;
        System.out.println("  [↓ Abajo] Comando actual: " + cursor.texto);
    }

    // Muestra el comando donde está el cursor actualmente
    public void mostrarCursor() {
        if (estaVacio()) {
            System.out.println("  [Historial vacío]");
            return;
        }
        System.out.println("  [Cursor] → \"" + cursor.texto + "\""
                + "  |  Exitoso: " + (cursor.exitoso ? "Sí" : "No")
                + "  |  Dir: " + cursor.directorio);
    }

    // Elimina el comando actual (cursor) y mueve el cursor al siguiente
    public void eliminarActual() {
        if (estaVacio()) {
            System.out.println("  [Historial vacío, nada que eliminar]");
            return;
        }
        System.out.println("  [Eliminando] \"" + cursor.texto + "\"");

        // Si es el único nodo
        if (cursor.siguiente == cursor) {
            cabeza  = null;
            cola    = null;
            cursor  = null;
            return;
        }

        Comando aEliminar = cursor;
        // Mover cursor ANTES de desconectar
        cursor = aEliminar.siguiente;

        // Reconectar vecinos
        aEliminar.anterior.siguiente = aEliminar.siguiente;
        aEliminar.siguiente.anterior = aEliminar.anterior;

        // Actualizar cabeza o cola si era alguno de ellos
        if (aEliminar == cabeza) cabeza = aEliminar.siguiente;
        if (aEliminar == cola)   cola   = aEliminar.anterior;
    }

    // Muestra todo el historial marcando el cursor
    public void mostrarHistorial() {
        if (estaVacio()) {
            System.out.println("  [Historial vacío]");
            return;
        }
        System.out.println("  === Historial completo (más antiguo → más reciente) ===");
        Comando actual = cabeza;
        int numero = 1;
        do {
            String marca   = (actual == cursor) ? " ◄ CURSOR" : "";
            String estado  = actual.exitoso ? "[OK]" : "[ERR]";
            System.out.println("  " + numero + ". " + estado
                    + " \"" + actual.texto + "\""
                    + "  en " + actual.directorio + marca);
            actual = actual.siguiente;
            numero++;
        } while (actual != cabeza);
        System.out.println("  (circular → regresa a \"" + cabeza.texto + "\")");
    }
}
