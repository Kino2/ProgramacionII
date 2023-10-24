package Parcial;

public class FiltroAutor extends Filtro{
    private String autor;

    public FiltroAutor(String autor) {
        this.autor = autor.toLowerCase();
    }

    @Override
    public boolean cumple(Noticia n) {
        String autorNoticia = n.getAutor().toLowerCase();
        return autorNoticia.contains(autor);
    }

    
}
