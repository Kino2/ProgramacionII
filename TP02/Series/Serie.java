package TP02;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador,
            String genero, ArrayList<Temporada> temporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    public int getEpisodiosVistos() {
        int total = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            total += temporadas.get(i).getEpisodiosVistos();
        }
        return total;
    }

    public double getPromedio() {
        int calificaciones = 0;
        int temps = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            calificaciones += temporadas.get(i).getCalificacionesTotales();
            temps++;
        }
        return (double) calificaciones / temps;
    }

    public boolean vioTodaLaSerie() {
        for (int i = 0; i < temporadas.size(); i++) {
            if (!temporadas.get(i).vioLaTemporadaCompleta()) {
                return false;
            }
        }
        return true;
    }

}
