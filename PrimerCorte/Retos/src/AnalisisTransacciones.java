import java.util.Scanner;
/*4. Fintech: Analisis de Transacciones
Un banco registra transacciones. Tienes una lista de cuentasVIP ordenada (ej: 10, 25, 40, 80,150)
• Entrada de Datos: El usuario debe ingresar los montos y los números de cuenta de las últimas 5
transacciones del cajero automático.
• El Reto:
i. Busca linealmente cualquier transacción cuyo monto supere los $5,000
ii.Para cada cuenta que supere ese monto, verifica con Búsqueda Binaria si pertenece a las cuentasvIP .
Si no es VIP, imprime: "Alerta de fraude: Cuenta no autorizada para montos altos"
• Por qué ambos?
Las ventas ocurren en desorden, pero la verificación de estatus VIP es una consulta de base de datos indexada. */


public class AnalisisTransacciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cuentasVIP = {10, 25, 40, 80, 150};

        int[] cuentas = new int[5];
        double[] montos = new double[5];

        
        System.out.println("Ingresa los datos de las últimas 5 transacciones:\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Transacción " + (i + 1) + " Número de cuenta: ");
            cuentas[i] = sc.nextInt();
            System.out.print("Transacción " + (i + 1) + " Monto: ");
            montos[i] = sc.nextDouble();
            System.out.println();
        }

        
        System.out.println("ANÁLISIS DE TRANSACCIONES");
        

        for (int i = 0; i < 5; i++) {
            if (montos[i] > 5000) {
                System.out.println("\nTransacción " + (i + 1) + " supera $5,000");
                System.out.println("   Cuenta: " + cuentas[i] + "  |  Monto: " + String.format("%.2f", montos[i]));

                boolean esVIP = busquedaBinaria(cuentasVIP, cuentas[i]);

                if (esVIP) {
                    System.out.println(" Cuenta VIP verificada. Transacción autorizada.");

                }else
                {
                    System.out.println(" Alerta de fraude: Cuenta no autorizada para montos altos.");
                }
            }
            else {
                System.out.println("\nTransacción " + (i + 1) + " no supera $5,000");
                System.out.println("   Cuenta: " + cuentas[i] + "  |  Monto: " + String.format("%.2f", montos[i]));
                System.out.println(" Transacción dentro de límites normales.");

            }
        }

        sc.close();
    }

    static boolean busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == valorBuscado) {
                return true;
            } else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return false;
    }
}