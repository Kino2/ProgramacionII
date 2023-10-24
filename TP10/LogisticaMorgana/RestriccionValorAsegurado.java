package LogisticaMorgana;

public class RestriccionValorAsegurado extends Restriccion {
    private double valorAsegurado;

    public RestriccionValorAsegurado(double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public boolean cumple(Combo c, ElementoLM e) {
        return e.getValorAsegurado() > valorAsegurado;
    }
    
}
