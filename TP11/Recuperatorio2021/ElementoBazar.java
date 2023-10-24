package TP11.Recuperatorio2021;

import java.util.ArrayList;

public abstract class ElementoBazar {

    public abstract double getPrecio();
    
    public abstract double getPeso();

    public abstract ArrayList<String> getCategorias();

    public abstract int getCantidad();

    public abstract Producto getMenor();
}
