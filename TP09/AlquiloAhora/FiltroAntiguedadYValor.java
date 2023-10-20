package AlquiloAhora;

public class FiltroAntiguedadYValor extends Filtro {
    private int antiguedad;
    private double valor;

    public FiltroAntiguedadYValor(int antiguedad, double valor) {
        this.antiguedad = antiguedad;
        this.valor = valor;
    }

    @Override
    public boolean cumple(Inventario i) {
        return i.getAntiguedad() > antiguedad && i.getValorTotal() < valor;
    }

}
