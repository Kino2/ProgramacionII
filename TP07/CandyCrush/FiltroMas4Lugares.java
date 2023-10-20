package CandyCrush;

public class FiltroMas4Lugares extends Filtro {

    public boolean cumple(Ficha f) {
        return f.getEspacio() > 4;
    }
}
