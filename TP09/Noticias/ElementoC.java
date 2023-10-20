package Noticias;

import java.util.ArrayList;

public abstract class ElementoC {
    private Categoria padre;

    public abstract ArrayList<ElementoC> busqueda(Filtro f);

    public abstract int cantNoticias();

    public abstract String getNombre();

    public abstract ArrayList<String> dibujarmapa();

    public Categoria getPadre() {
        return padre;
    }

    public void setPadre(Categoria padre) {
        this.padre = padre;
    }

    public abstract String getPath();

}
