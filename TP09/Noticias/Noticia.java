package Noticias;

import java.util.ArrayList;

public class Noticia extends ElementoC {
    private String titulo;
    private ArrayList<String> palabrasClaves;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;

    public Noticia(String titulo, ArrayList<String> palabrasClaves, String introduccion, String texto, String autor,
            String link) {
        this.titulo = titulo;
        this.palabrasClaves = palabrasClaves;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
    }

    public String getNombre() {
        return titulo;
    }

    public ArrayList<String> dibujarmapa() {
        ArrayList<String> yo = new ArrayList<>();
        yo.add(" " + this.getNombre());
        return yo;
    }

    @Override
    public ArrayList<ElementoC> busqueda(Filtro f) {
        ArrayList<ElementoC> lista = new ArrayList<>();
        if (f.cumple(this)) {
            lista.add(this);
        }
        return lista;
    }

    @Override
    public int cantNoticias() {
        return 1;
    }

    public String getPath() {
        if (this.getPadre() != null)
            return this.getPadre().getPath() + "\\" + this.getNombre();
        else
            return this.getNombre();
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public String getAutor() {
        return autor;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "/" + this.getNombre();
    }

}
