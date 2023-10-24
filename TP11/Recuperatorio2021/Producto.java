package TP11.Recuperatorio2021;

import java.util.ArrayList;

public class Producto extends ElementoBazar{
    private ArrayList<String> categorias;
    private double peso;
    private double precio;

    public Producto(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
        categorias = new ArrayList<>();
    }

    public ArrayList<String> getCategorias() {
        return new ArrayList<String>(categorias);
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }


    

}
