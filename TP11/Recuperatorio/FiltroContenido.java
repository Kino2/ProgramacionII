package TP11.Recuperatorio;

public class FiltroContenido extends Filtro {
    private String palabra;

    public FiltroContenido(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getContenido().contains(palabra);
    }
    
}
