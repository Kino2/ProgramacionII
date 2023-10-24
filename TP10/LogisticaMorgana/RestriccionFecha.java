package LogisticaMorgana;

public class RestriccionFecha extends Restriccion {

    @Override
    public boolean cumple(Combo c, ElementoLM e) {
        return c.getfPartida().equals(e.getfPartida());
    }
    
}
