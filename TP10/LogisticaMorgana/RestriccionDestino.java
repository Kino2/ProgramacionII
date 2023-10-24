package LogisticaMorgana;

public class RestriccionDestino extends Restriccion {

    @Override
    public boolean cumple(Combo c, ElementoLM e) {
        return c.getDestino().equalsIgnoreCase(e.getDestino());
    }
    
}
