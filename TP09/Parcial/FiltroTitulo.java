package Parcial;

public class FiltroTitulo extends Filtro {
    private String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().toLowerCase().equals(titulo);
    }
    
}
