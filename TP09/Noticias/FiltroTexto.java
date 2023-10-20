package Noticias;

public class FiltroTexto extends Filtro {
    private int numMenor;

    public FiltroTexto(int numMenor) {
        this.numMenor = numMenor;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length() > numMenor;
    }

}
