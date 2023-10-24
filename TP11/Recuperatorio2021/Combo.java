package TP11.Recuperatorio2021;

import java.util.ArrayList;

public class Combo extends ElementoBazar {
    private String nombre;
    private ArrayList<ElementoBazar> elementos;

    public Combo(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoBazar elemento, Filtro filtro) {
        if (filtro.cumple(elemento)) {
            elementos.add(elemento);
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ElementoBazar e : elementos) {
            ArrayList<String> categorias = e.getCategorias();
            for (String s : categorias) {
                if (!resultado.contains(s)) {
                    resultado.add(s);
                }
            }
        }
        return resultado;
    }

    @Override
    public double getPeso() {
        double peso = 0.0;
        for (ElementoBazar e : elementos) {
            peso += e.getPeso();
        }
        return peso;
    }

    @Override
    public double getPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }

}
