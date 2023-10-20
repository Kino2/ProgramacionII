package AlquiloAhora;

public class FiltroAND extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Inventario i) {
        return f1.cumple(i) && f2.cumple(i);
    }

}
