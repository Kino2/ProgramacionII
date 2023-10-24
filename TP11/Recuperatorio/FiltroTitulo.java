package TP11.Recuperatorio;

public class FiltroTitulo extends Filtro {
    private String palabra;

    public FiltroTitulo(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().contains(palabra);
    }

}
