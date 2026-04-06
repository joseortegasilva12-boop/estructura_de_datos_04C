package Ejercicios_Input.src;
import java.util.Scanner;
/*### Ejercicio 2 — Conversor de temperatura
Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

**Fórmulas:**
- `F = (C × 9/5) + 32`
- `K = C + 273.15`

**Dato de entrada:** `double` temperatura en Celsius

**Salida esperada:**
```
25.0 °C = 77.0 °F = 298.15 K */

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitor temperatura en Celsius al usuario
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        // Convertir a Fahrenheit y Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Mostrar el resultado
        System.out.printf( celsius + " °C = " + fahrenheit + " °F = " + kelvin + " K");

    }
}
