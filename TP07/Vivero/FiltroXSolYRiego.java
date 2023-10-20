package Vivero;

public class FiltroXSolYRiego extends Filtro {
    public boolean cumple(Planta planta) {
        return planta.getSol() > 5 && planta.getRiego() < 3;
    }

}
