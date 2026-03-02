package Ejercicios_Input.src;
import java.util.Scanner;
import java.util.Locale;
/*### Ejercicio 5 — Calculadora de IMC
Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.

**Fórmula:** `IMC = peso / (altura x altura)`

**Clasificación:**
- IMC < 18.5 → Bajo peso
- 18.5 ≤ IMC < 25 → Normal
- 25 ≤ IMC < 30 → Sobrepeso
- IMC ≥ 30 → Obesidad

**Datos de entrada:** `String` nombre, `double` peso, `double` altura */

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Aquí puedes implementar el código para el ejercicio
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        double imc = (peso / (altura * altura));
        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            clasificacion = "Normal";
        } else if (imc >= 25 && imc < 30) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }
        System.out.println("Nombre: " + nombre);
        System.out.println(Locale.US + "IMC: " + imc);
        System.out.println("Clasificación: " + clasificacion);
    }
}
