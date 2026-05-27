public class Carro {

    String placa;
    String propietario;
    int horasEstacionado;
    boolean esMensual;
    Carro siguiente;

    public Carro(String placa, String propietario, int horasEstacionado, boolean esMensual) {
        this.placa = placa;
        this.propietario = propietario;
        this.horasEstacionado = horasEstacionado;
        this.esMensual = esMensual;
        this.siguiente = null;
    }
}
