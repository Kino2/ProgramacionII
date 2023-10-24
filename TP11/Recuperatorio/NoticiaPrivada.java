package TP11.Recuperatorio;

public class NoticiaPrivada extends Noticia {
    public NoticiaPrivada(String titulo, String contenido, String autor, String categoria) {
        super(titulo, contenido, autor, categoria);
    }

    @Override
    public ElementoPortal copiaRestringida(Filtro f) {
        return null;
    }

}
