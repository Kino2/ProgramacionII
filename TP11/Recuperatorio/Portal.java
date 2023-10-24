package TP11.Recuperatorio;

import java.util.ArrayList;

public class Portal {
    private String categoriaRaiz;
    private ArrayList<Suscriptor> suscriptores;

    public Portal(ElementoPortal elemento) {
        categoriaRaiz = elemento.getCategoria();
        suscriptores = new ArrayList<>();
    }

    public void repartirNoticiaASuscriptores(Noticia noticia) {
        for (Suscriptor suscriptor : suscriptores) {
            suscriptor.recibirNoticia(noticia);
        }
    }

    public String getCategoriaRaiz() {
        return categoriaRaiz;
    }

    public ArrayList<Suscriptor> getSuscriptores() {
        return new ArrayList<>(suscriptores);
    }
}
