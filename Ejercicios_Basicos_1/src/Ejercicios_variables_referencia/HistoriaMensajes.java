package Ejercicios_variables_referencia;

public class HistoriaMensajes {
    public static void main(String[] args) {

        /*
        Un chat guarda el último mensaje enviado. Se usan dos variables String:
        -ultimoMensaje = "Hola"
        -copiaTexto = ultimoMensaje
        -Luego copiaTextose cambia a"¿Cómo estás?"
        -Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió (inmutabilidad de String).
         */
        //Definimos el último mensaje enviado
        String ultimoMensaje = "Hola";
        //Asignamos copiaTexto al mismo valor que ultimoMensaje
        String copiaTexto = ultimoMensaje;

        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia de texto: " + copiaTexto);

        //Cambiamos el valor de copiaTexto
        copiaTexto = "¿Cómo estás?";

        System.out.println("\nDespués de cambiar copiaTexto:");
        System.out.println("Último mensaje: " + ultimoMensaje); // No cambia porque String es inmutable
        System.out.println("Copia de texto: " + copiaTexto); // Cambia porque se asigna un nuevo valor
    }
}
