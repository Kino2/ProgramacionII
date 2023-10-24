package TP11.Recuperatorio;

import java.util.ArrayList;

public class Noticia extends ElementoPortal {
    private String contenido;
    private String autor;
    private String titulo;
    private ArrayList<String> palabrasClave;

    public Noticia(String titulo, String contenido, String autor, String categoria) {
        super(categoria);
        this.contenido = contenido;
        this.autor = autor;
        this.titulo = titulo;
        palabrasClave = new ArrayList<>();
    }

    public void addPalabraClave(String s) {
        if (!palabrasClave.contains(s)) {
            palabrasClave.add(s);
        }
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<String>(palabrasClave);
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public ElementoPortal copiaRestringida(Filtro f) {
        if (f.cumple(this)) {
            Noticia copia = new Noticia(this.titulo, this.contenido, this.autor, this.getCategoria());
            for (String s : palabrasClave) {
                copia.addPalabraClave(s);
            }
            return copia;
        }
        return null;
    }

}
