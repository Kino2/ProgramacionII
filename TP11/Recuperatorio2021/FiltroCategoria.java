package TP11.Recuperatorio2021;

import java.util.ArrayList;

public class FiltroCategoria extends Filtro {
    private String categoria;

    public FiltroCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(ElementoBazar elemento) {
        ArrayList<String> categorias = elemento.getCategorias();
        return categorias.contains(categoria);
    }

}
