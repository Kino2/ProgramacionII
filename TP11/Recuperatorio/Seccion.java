package TP11.Recuperatorio;

import java.util.ArrayList;

public class Seccion extends ElementoPortal {
    protected ArrayList<ElementoPortal> elementos;

    public Seccion(String categoria) {
        super(categoria);
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoPortal nuevo) {
        int pos = 0;
        while (pos < this.elementos.size() && this.elementos.get(pos).compareTo(nuevo) < 0) {
            pos++;
        }
        this.elementos.add(pos, nuevo);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> unionPalabras = new ArrayList<>();
        for (ElementoPortal hijo : this.elementos) {
            ArrayList<String> palabrasHijo = hijo.getPalabrasClave();
            for (String palabra : palabrasHijo) {
                if (!unionPalabras.contains(palabra)) {
                    unionPalabras.add(palabra);
                }
            }
        }
        return unionPalabras;
    }

    @Override
    public ElementoPortal copiaRestringida(Filtro f) {
        ArrayList<ElementoPortal> hijosQueCumplen = new ArrayList<>();
        for (ElementoPortal hijo : this.elementos) {
            ElementoPortal copiaHijo = hijo.copiaRestringida(f);
            if (copiaHijo != null) {
                hijosQueCumplen.add(copiaHijo);
            }
        }
        if (hijosQueCumplen.size() > 0) {
            Seccion copia = obtenerCopia();
            for (ElementoPortal copiaHijo : hijosQueCumplen) {
                copia.agregarElemento(copiaHijo);
            }
            return copia;
        } else {
            return null;
        }
    }

    public Seccion obtenerCopia() {
        return new Seccion(getCategoria());
    }
}
