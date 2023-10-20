package Vivero;

public class FiltroXSolYRiego2 extends Filtro{
    public boolean cumple(Planta planta) {
        return planta.getSol() < 4 && planta.getRiego() > 4;
    }
}
