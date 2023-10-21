package Contrato;

public class OfertaLaboral {
    private int horasOfrecidas;
    private String empresaOfrecida;
    private double sueldoOfrecido;

    public OfertaLaboral(int horasOfrecidas, String empresaOfrecida, double sueldoOfrecido) {
        this.horasOfrecidas = horasOfrecidas;
        this.empresaOfrecida = empresaOfrecida;
        this.sueldoOfrecido = sueldoOfrecido;
    }

    public int getHorasOfrecidas() {
        return horasOfrecidas;
    }

    public String getEmpresaOfrecida() {
        return empresaOfrecida;
    }

    public double getSueldoOfrecido() {
        return sueldoOfrecido;
    }

}
