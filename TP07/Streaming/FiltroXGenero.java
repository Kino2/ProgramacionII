package Streaming;

public class FiltroXGenero extends Filtro {
    private String genero;
    
    public FiltroXGenero(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Pelicula peli){
        return peli.getGenero().equalsIgnoreCase(genero);
    }
}
