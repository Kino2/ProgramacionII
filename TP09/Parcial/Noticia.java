package Parcial;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia {
    private String texto, titulo, autor, categoria;
    ArrayList<String> palabrasClaves;

    public Noticia(String texto, String titulo, String autor, String categoria, ArrayList<String> palabrasClaves) {
        this.texto = texto;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClaves = palabrasClaves;
    }

    public void addPalabraClave(String palabra) {
        palabrasClaves.add(palabra);
    }

    @Override
    public void agregarPalabraSegunFiltro(Filtro f, String palabra) {
        if(f.cumple(this)){
            addPalabraClave(palabra);
        }
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    @Override
    public ArrayList<Noticia> busqueda(Filtro f) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        if (f.cumple(this)) {
            resultado.add(this);
            return resultado;
        } else {
            return new ArrayList<>();
        }
    }
    

    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Noticia [texto=" + texto + ", titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria
                + ", palabrasClaves=" + palabrasClaves + "]";
    }

}
