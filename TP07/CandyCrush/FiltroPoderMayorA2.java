package CandyCrush;

public class FiltroPoderMayorA2 extends Filtro {
    
    public boolean cumple(Ficha f){
        return f.getPoder() > 2;
    }
}
