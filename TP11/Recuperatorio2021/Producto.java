package TP11.Recuperatorio2021;

import java.util.ArrayList;

public class Producto extends ElementoBazar {
    private ArrayList<String> categorias;
    private double peso;
    private double precio;

    public Producto(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
        categorias = new ArrayList<>();
    }

    @Override
    public ElementoBazar copiaRestringida(Filtro f) {
        if (f.cumple(this)) {
            Producto copia = new Producto(this.getPeso(), this.getPrecio());
            for (String s : categorias) {
                copia.addCategoria(s);
            }
            return copia;
        } else {
            return null;
        }
    }

    public void addCategoria(String c) {
        if (!categorias.contains(c)) {
            categorias.add(c);
        }
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

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public ArrayList<ElementoBazar> busqueda(Filtro f) {
        ArrayList<ElementoBazar> resultado = new ArrayList<>();
        if (f.cumple(this)) {
            resultado.add(this);
            return resultado;
        } else {
            return new ArrayList<>();
        }
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }

    @Override
    public Producto getMenor() {
        return this;
    }

    @Override
    public String toString() {
        return "Producto [categorias=" + categorias + ", peso=" + peso + ", precio=" + precio + "]";
    }

}
