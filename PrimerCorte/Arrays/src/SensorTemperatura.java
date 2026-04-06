/*3. Sensor de Temperatura (Control de Calidad)
Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para 
asegurarse de que la máquina no se recalentó.
Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para 
encontrar el mayor de todos. */

public class SensorTemperatura {
    public static void main(String[] args) {
        
        double[] registros = {22.5, 24.8, 31.2, 29.5, 35.6, 28.1};

    
        double temperaturaMaxima = registros[0];

        
        for (int i = 1; i < registros.length; i++) {
            if (registros[i] > temperaturaMaxima) {
                temperaturaMaxima = registros[i]; 
            }
        }

        System.out.println("La temperatura más alta registrada fue: " + temperaturaMaxima + "°C");
    }
}