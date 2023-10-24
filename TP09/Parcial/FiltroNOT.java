package Parcial;

public class FiltroNOT extends Filtro {
    private Filtro f;

    public FiltroNOT(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Noticia n) {
        return !f.cumple(n);
    }

}
