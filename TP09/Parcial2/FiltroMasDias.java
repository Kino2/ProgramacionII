package Parcial2;

public class FiltroMasDias extends Filtro {
    private int dias;

    public FiltroMasDias(int dias) {
        this.dias = dias;
    }

    @Override
    public boolean cumple(Tarea t) {
        return t.getTiempoEstimado() >= dias;
    }
    
}
