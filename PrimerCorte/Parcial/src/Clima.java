/*clima
Objetivo: analizar temperaturas semanales y buscar registros
¿que se debe hacer?
1. entrada: pide 7 temperaturas (double) y guardarlas en un arreglo
2. ordenamiento: usa seleccion (seleccion sort) para ordenar el arreglo de menor a mayor
3. busqueda: pide una temperatura y buscala con busqueda lineal.
4. calculo: muestra el promedio de las temperaturas de la semana
 */

import java.util.Scanner;

public class Clima
{
    public static void main(String[] args)
    {
        double suma = 0;
        boolean condicion = true;
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];

        while (condicion) {
            System.out.println("menu");
            System.out.println("1. Ingresar temperaturas");
            System.out.println("2. Ordenar");
            System.out.println("3. Buscar temperatura");
            System.out.println("4. promedio");
            System.out.println("5. salir");
            
            int opcion = sc.nextInt();

            switch (opcion)
            {
            case 1:
                
            
                // Entrada: pedir 7 temperaturas
                System.out.println("Ingrese las temperaturas de la semana:");
                for (int i = 0; i < temperaturas.length; i++)
                {
                    System.out.print("Día " + (i + 1) + ": ");
                    temperaturas[i] = sc.nextDouble();
                    suma += temperaturas[i];
                }
                
                break;
            case 2:
                // Ordenamiento por selecion de sort
                for (int i = 0; i < temperaturas.length - 1; i++)
                {
                    int minIndex = i;
                    for (int j = i + 1; j < temperaturas.length; j++)
                    {
                        if (temperaturas[j] < temperaturas[minIndex])
                        {
                            minIndex = j;
                        }
                    }
                    // Intercambio
                    double temp = temperaturas[i];
                    temperaturas[i] = temperaturas[minIndex];
                    temperaturas[minIndex] = temp;
                }
                System.out.println("Temperaturas ordenadas: ");
                for (double temp : temperaturas)                {
                    System.out.println(temp);
                }

                
                break;
            case 3:
                
        
                System.out.print("Ingrese la temperatura a buscar: ");
                double tempBuscada = sc.nextDouble();
                boolean encontrada = false;
            
                // Búsqueda lineal
                for (int i = 0; i < temperaturas.length; i++)
                {
                    if (temperaturas[i] == tempBuscada)
                    {
                        System.out.println("Temperatura " + tempBuscada + " encontrada en el día " + (i + 1));
                        encontrada = true;
                        break;
                    }
                }
                if (!encontrada)
                {
                    System.out.println("Temperatura " + tempBuscada + " no encontrada.");
                }
                break;
            case 4:
                //mostrar el promedio de las temperaturas de la semana
                double promedio = suma / temperaturas.length;
                System.out.println("Promedio de temperaturas: " + promedio);
                break;
            case 5:
                System.out.println("Saliendo...");
                condicion = false;
                break;
            default:
                System.out.println("Opción no válida");
            }
        }
        

    }
}

