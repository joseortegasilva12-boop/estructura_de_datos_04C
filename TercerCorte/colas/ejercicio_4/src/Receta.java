public class Receta {

    String codigoReceta;
    String paciente;
    String medicamento;
    boolean requiereFormula;
    Receta siguiente;

    public Receta(String codigoReceta, String paciente, String medicamento, boolean requiereFormula) {
        this.codigoReceta = codigoReceta;
        this.paciente = paciente;
        this.medicamento = medicamento;
        this.requiereFormula = requiereFormula;
        this.siguiente = null;
    }
}
