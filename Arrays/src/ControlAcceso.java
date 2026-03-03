/*4. Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad.
La lista está ordenada de menor a mayor.

El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día".
no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada. */

public class ControlAcceso {
    public static void main(String[] args) {
        // Lista de códigos de acceso ordenada
        int[] codigosAcceso = {102, 205, 310, 450, 500, 612, 789, 900};
        int codigoIngresado = 450;

        int inicio = 0;
        int fin = codigosAcceso.length - 1;
        boolean accesoPermitido = false;

        // Búsqueda Binaria
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (codigosAcceso[medio] == codigoIngresado) {
                accesoPermitido = true;
                break; 
            }
            
            if (codigosAcceso[medio] < codigoIngresado) {
                inicio = medio + 1; // Buscar en la derecha
            } else {
                fin = medio - 1;    // Buscar en la izquierda
            }
        }

        if (accesoPermitido) {
            System.out.println("Entrada permitida. Bienvenido al gimnasio.");
        } else {
            System.out.println("Acceso denegado. Código no registrado.");
        }
    }
}