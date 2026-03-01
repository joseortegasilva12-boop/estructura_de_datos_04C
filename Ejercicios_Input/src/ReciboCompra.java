package Ejercicios_Input.src;
import java.util.Scanner;
/*## Tema 1 — Variables y tipos de datos

### Ejercicio 1 — Recibo de compra
Pide al usuario el nombre de un producto, la cantidad comprada y el precio unitario.
Calcula el subtotal, aplica un IVA del 19% y muestra el recibo con el total a pagar.

**Datos de entrada:**
- `String` nombre del producto
- `int` cantidad
- `double` precio unitario

**Salida esperada:**

===== Recibo =====
Producto  : Arroz
Cantidad  : 3
Precio c/u: $2500.00
Subtotal  : $7500.00
IVA (19%) : $1425.00
Total     : $8925.00
 */

public class ReciboCompra {

    public static void main(String[] args) {
        // Aquí puedes implementar el código para el ejercicio
        Scanner sc = new Scanner(System.in);
        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = sc.nextLine();
        System.out.print("Ingrese la cantidad comprada: ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        double subtotal = cantidad * precioUnitario;
        double iva = subtotal * 0.19;
        double total = subtotal + iva;

        System.out.println("===== Recibo =====");
        System.out.println("Producto  : " + nombreProducto);
        System.out.println("Cantidad  : " + cantidad);
        System.out.printf("Precio c/u: $%.2f%n", precioUnitario);
        System.out.printf("Subtotal  : $%.2f%n", subtotal);
        System.out.printf("IVA (19%%) : $%.2f%n", iva);
        System.out.printf("Total     : $%.2f%n", total);
    }
    
}
