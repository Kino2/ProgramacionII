package Streaming;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String genero;
    private String director;
    private ArrayList<String> actores;
    private LocalDate estreno;
    private int duracion;
    private int edadMin;
    
    public Pelicula(String titulo, String sinopsis, String genero, String director, ArrayList<String> actores,
            LocalDate estreno, int duracion, int edadMin) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.director = director;
        this.actores = actores;
        this.estreno = estreno;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", sinopsis=" + sinopsis + ", genero=" + genero + ", director=" + director
                + ", actores=" + actores + ", estreno=" + estreno + ", duracion=" + duracion + ", edadMin=" + edadMin
                + "]";
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public LocalDate getEstreno() {
        return estreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    
}
