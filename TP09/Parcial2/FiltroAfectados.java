package Parcial2;

public class FiltroAfectados extends Filtro {
    private int afectados;

    public FiltroAfectados(int afectados) {
        this.afectados = afectados;
    }

    @Override
    public boolean cumple(Tarea t) {
        return t.getEmpleadosAfectados() < afectados;
    }

}
