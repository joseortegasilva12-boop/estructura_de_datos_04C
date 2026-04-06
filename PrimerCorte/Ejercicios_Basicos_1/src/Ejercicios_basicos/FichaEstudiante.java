package Ejercicios_basicos;

/*Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código
(número entero), semestre actual, promedio acumulado y si está matriculado o no.
Declara las variables con los tipos de datos apropiados.
Asigna valores de ejemplo.
Imprima un informe por consola con el siguiente formato:
=== Ficha del Estudiante ===
Nombre: Ana Torres
Código: 20241001
Semestre: 3
Promedio: 3.85
Matriculado: true */

public class FichaEstudiante {
    public static void main(String[] args) {
        // Declaración de variables con tipos adecuados
        String nombreCompleto = "Ana Torres";
        int codigoEstudiante = 20241001;
        int semestreActual = 3;
        double promedioAcumulado = 3.85;
        boolean estaMatriculado = true;

        // Impresión del reporte con formato limpio
        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Código: " + codigoEstudiante);
        System.out.println("Semestre: " + semestreActual);
        System.out.println("Promedio: " + promedioAcumulado);
        System.out.println("Matriculado: " + estaMatriculado);
    }
}