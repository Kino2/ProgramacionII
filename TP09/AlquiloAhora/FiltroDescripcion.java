package AlquiloAhora;

public class FiltroDescripcion extends Filtro {
    private String descripcion;

    public FiltroDescripcion(String descripcion) {
        this.descripcion = descripcion.toLowerCase();
    }

    public boolean cumple(Inventario i){
        return i.getDescripcion().toLowerCase().contains(descripcion);
    }
    
}
