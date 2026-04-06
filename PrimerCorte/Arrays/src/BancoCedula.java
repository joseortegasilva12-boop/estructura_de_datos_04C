/*2. Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más 
rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al 
cliente dividiendo la lista a la mitad en cada paso. */

public class BancoCedula {
    public static void main(String[] args) {
        // Lista de IDs ordenada de forma ascendente
        int[] cedulasClientes = {1010, 2020, 3030, 4040, 5050, 6060, 7070, 8080};
        int idBuscado = 6060;

        int inicio = 0;
        int fin = cedulasClientes.length - 1;
        int posicion = -1;

        // Búsqueda Binaria
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (cedulasClientes[medio] == idBuscado) {
                posicion = medio;
                break; 
            }
            
            if (cedulasClientes[medio] < idBuscado) {
                inicio = medio + 1; // Buscar en la derecha
            } else {
                fin = medio - 1;    // Buscar en la izquierda
            }
        }

        if (posicion != -1) {
            System.out.println("Cliente hallado en el índice: " + posicion);
        } else {
            System.out.println("Cédula no registrada.");
        }
    }
}