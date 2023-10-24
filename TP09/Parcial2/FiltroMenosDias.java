package Parcial2;

public class FiltroMenosDias extends Filtro {
    private int dias;

    public FiltroMenosDias(int dias) {
        this.dias = dias;
    }

    @Override
    public boolean cumple(Tarea t) {
        return t.getTiempoEstimado() < dias;
    }


}
