package Ejercicios_basicos;

/*Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

Precio unitario de un producto ( double)
Cantidad comprada ( int)
Descuento aplicado en porcentaje ( double)
Total a pagar después del descuento
Declara las variables, realiza el cálculo y muestra el resultado por consola. */

public class CalculadoraTienda {
    public static void main(String[] args) {
        // Datos de entrada
        double precioUnitario = 1500.0;
        int cantidadComprada = 5;
        double descuentoPorcentaje = 10.0;

        // Procesamiento de datos
        double subtotal = precioUnitario * cantidadComprada;
        double descuentoCalculado = subtotal * (descuentoPorcentaje / 100);
        double totalFinal = subtotal - descuentoCalculado;

        // Salida de resultados
        System.out.println("=== Detalle de Compra ===");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento (" + descuentoPorcentaje + "%): $" + descuentoCalculado);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}