package TP11.Recuperatorio;

import java.util.ArrayList;

public abstract class ElementoPortal implements Comparable<ElementoPortal> {
    private String categoria;

    public ElementoPortal(String categoria) {
        this.categoria = categoria;
    }
    
    public abstract ArrayList<String> getPalabrasClave();

    public abstract ElementoPortal copiaRestringida(Filtro f);
    
    public String getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(ElementoPortal o) {
        return this.getCategoria().compareTo(o.getCategoria());
    }
    
}
