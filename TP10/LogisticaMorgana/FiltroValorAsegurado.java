package LogisticaMorgana;

public class FiltroValorAsegurado extends Filtro {
    private double valorAsegurado;

    public FiltroValorAsegurado(double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public boolean cumple(ElementoLM e) {
        return e.getValorAsegurado() > valorAsegurado;
    }

}
