package CandyCrush;

public class FiltroFortMayorA5 extends Filtro {
    
    public boolean cumple(Ficha f){
        return f.getFortaleza() > 5;
    }
}
