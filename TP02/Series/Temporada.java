package TP02;

import java.util.ArrayList;

public class Temporada {
    private int cantEpisodios;
    private ArrayList<Episodio> episodios;

    public Temporada(int cantEpisodios, ArrayList<Episodio> episodios) {
        this.cantEpisodios = cantEpisodios;
        this.episodios = episodios;
    }

    public int getEpisodiosVistos() {
        int total = 0;
        for (int i = 0; i < cantEpisodios; i++) {
            if (episodios.get(i).getVisto() == true) {
                total++;
            }
        }
        return total;
    }

    public int getCalificacionesTotales() {
        int total = 0;
        for (int i = 0; i < cantEpisodios; i++) {
            if (episodios.get(i).getVisto() == true) {
                total += episodios.get(i).getCalificacion();
            }
        }
        return total;
    }

    public double getPromedioCalificaciones() {
        int episodiosVistos = this.getEpisodiosVistos();
        int calificaciones = this.getCalificacionesTotales();
        double promedio = calificaciones/episodiosVistos;
        return promedio;
    }
    
    public boolean vioLaTemporadaCompleta(){
        return this.episodios.size() == this.getEpisodiosVistos();
    }
}
