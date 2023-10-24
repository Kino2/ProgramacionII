package TP11.Recuperatorio;

import java.util.ArrayList;

public class SeccionRestringida extends Seccion {
    private ArrayList<String> categoriasPermitidas;

    public SeccionRestringida(String categoria) {
        super(categoria);
    }

    public void agregarCategoriaPermitida(String categoria) {
        if (!categoriasPermitidas.contains(categoria)) {
            categoriasPermitidas.add(categoria);
        }
    }

    @Override
    public void agregarElemento(ElementoPortal nuevo) {
        if (!categoriasPermitidas.contains(nuevo.getCategoria())) {
            super.agregarElemento(nuevo);
        }
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
            SeccionRestringida copia = obtenerCopia();
            for (ElementoPortal copiaHijo : hijosQueCumplen) {
                copia.agregarElemento(copiaHijo);
            }
            return copia;
        } else {
            return null;
        }
    }

    public ArrayList<String> getCategoriasPermitidas() {
        return new ArrayList<String>(categoriasPermitidas);
    }

    @Override
    public SeccionRestringida obtenerCopia() {
        SeccionRestringida copia = new SeccionRestringida(this.getCategoria());
        for (String categoria : copia.getCategoriasPermitidas()) {
            copia.agregarCategoriaPermitida(categoria);
        }
        return copia;
    }

}
