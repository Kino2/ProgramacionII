package Streaming;

public class FiltroTitulo extends Filtro {
    public boolean cumple(Pelicula peli){
        String titulo = peli.getTitulo();
        return titulo.toLowerCase().contains("luna");
    }
}
