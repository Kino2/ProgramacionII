package TP02.Agenda;

import java.util.ArrayList;
import java.util.Date;

public class Reunion {
    private String lugar;
    private String tema;
    private ArrayList<Contacto> participantes;
    private int duracion;
    private Date fecha;

    public Reunion(String lugar, String tema, ArrayList<Contacto> participantes, int duracion, Date fecha) {
        this.lugar = lugar;
        this.tema = tema;
        this.participantes = participantes;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public String getLugar() {
        return this.lugar;
    }

    public String getTema() {
        return this.tema;
    }

    public ArrayList<Contacto> getParticipantes() {
        return this.participantes;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setParticipantes(ArrayList<Contacto> participantes) {
        this.participantes = participantes;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
