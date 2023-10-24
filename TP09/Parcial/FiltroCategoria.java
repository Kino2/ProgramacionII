package Parcial;

public class FiltroCategoria extends Filtro{
    private String categoria;

    public FiltroCategoria(String categoria) {
        this.categoria = categoria.toLowerCase();
    }

    @Override
    public boolean cumple(Noticia n) {
        String cat = n.getCategoria().toLowerCase();
        return cat.contains(categoria);
    }
    
}
