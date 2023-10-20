package MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public class Video extends ElementoM {
    private String titulo;
    private Usuario usuario;
    private int duracion;
    private int visualizaciones;
    private int likes;
    private int dislikes;
    private int anio;
    private ArrayList<String> palabrasClaves;

    public Video(String titulo, Usuario usuario, int duracion, int visualizaciones, int likes, int dislikes,
            ArrayList<String> palabrasClaves) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.duracion = duracion;
        this.visualizaciones = visualizaciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.palabrasClaves = palabrasClaves;
    }

    @Override
    public ArrayList<Video> busqueda(Filtro f, Comparator<Video> orden) {
        ArrayList<Video> video = new ArrayList<>();
        if (f.cumple(this)) {
            video.add(this);
            return video;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public int cantVideos() {
        return 1;
    }

    public int getAnio() {
        return anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", usuario=" + usuario.getNombre() + ", duracion=" + duracion + ", visualizaciones="
                + visualizaciones + ", likes=" + likes + ", dislikes=" + dislikes + ", anio=" + anio
                + ", palabrasClaves=" + palabrasClaves + "]";
    }

}
