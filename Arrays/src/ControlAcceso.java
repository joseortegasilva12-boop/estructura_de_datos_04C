import java.util.Scanner;
/*4. Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad.
La lista está ordenada de menor a mayor.

El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día".
no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada. */

public class ControlAcceso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.print("=======Menu=======");
            System.out.println("1. ingresar cuales son los codigos de acceso de los socios que pagaron la mensualidad");
            System.out.println("2. Ingresar el codigo de acceso del socio");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt(); 
            switch (opcion) {
                case 1:
                    System.out.println("Cuantos codigos desea ingresar? ");
                    int cantidadCodigos = sc.nextInt();
                    int[] codigosAcceso = new int[cantidadCodigos];
                    for (int i = 0; i < cantidadCodigos; i++) {
                        System.out.print("Ingrese el codigo de acceso del socio: ");
                        codigosAcceso[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    
                    System.out.print("Ingrese el código de acceso: ");
                    int codigoIngresado = sc.nextInt();
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
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }
}