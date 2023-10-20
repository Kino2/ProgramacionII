package AlquiloAhora;

public class FiltroIdentificacion extends Filtro {
    private int identificacion;

    public FiltroIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public boolean cumple(Inventario i) {
        return i.getIdentificacion() == identificacion;
    }

}
