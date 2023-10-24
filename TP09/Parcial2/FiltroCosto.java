package Parcial2;

public class FiltroCosto extends Filtro {
    private double costo;

    public FiltroCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean cumple(Tarea t) {
        return t.getCosto() < costo;
    }

}
