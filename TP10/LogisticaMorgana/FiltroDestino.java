package LogisticaMorgana;

public class FiltroDestino extends Filtro {
    private String destino;

    public FiltroDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(ElementoLM e) {
        return e.getDestino().equalsIgnoreCase(destino);
    }
    
}
