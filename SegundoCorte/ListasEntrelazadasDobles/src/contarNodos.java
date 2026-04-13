/*Contar los Nodos
A diferencia de los arreglos, que tienen la propiedad .length, en las listas enlazadas simples
por lo general no sabemos la cantidad de elementos a menos que la contemos, o que llevemos una variable contadora.
Tu misión: Implementa el método public int contarNodos() en tu clase ListaEnlazada.
Este método debe recorrer toda la lista, sumando 1 por cada nodo que visite, y retornar el total de elementos.
Pruébalo en tu método main insertando diferentes cantidades de elementos y mostrando el resultado por consola.
 */




// Clase ListaEnlazada
public class contarNodos {
    private App head;

    // Inserta al final de la lista
    public void insertar(int dato) {
        App nuevo = new App(dato);
        if (head == null) {
            head = nuevo;
        } else {
            App actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Cuenta los nodos recorriendo toda la lista
    public int ContarNodos() {
        int contador = 0;
        App actual = head;          // 1. Empezamos desde head

        while (actual != null) {     // 2. Mientras no lleguemos al final
            contador++;              // 3. Sumamos 1 por cada nodo visitado
            actual = actual.siguiente; // 4. Avanzamos al siguiente nodo
        }

        return contador;             // 5. Retornamos el total
    }

    // main para probar
    public static void main(String[] args) {
        contarNodos lista = new contarNodos();

        System.out.println("Lista vacía: " + lista.ContarNodos()); // 0

        lista.insertar(10);
        lista.insertar(25);
        lista.insertar(37);
        lista.insertar(52);
        System.out.println("Después de 4 inserciones: " + lista.ContarNodos()); // 4

        lista.insertar(99);
        System.out.println("Después de 5 inserciones: " + lista.ContarNodos()); // 5
    }
}