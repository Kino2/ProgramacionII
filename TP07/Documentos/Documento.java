package Documentos;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenidoTextual;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, ArrayList<String> autores, String contenidoTextual,
            ArrayList<String> palabrasClave) {
        this.titulo = titulo;
        this.autores = autores;
        this.contenidoTextual = contenidoTextual;
        this.palabrasClave = palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", autores=" + autores + ", contenidoTextual=" + contenidoTextual
                + ", palabrasClave=" + palabrasClave + "]";
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

}
