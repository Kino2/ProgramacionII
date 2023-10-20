package TP04.Seleccion;

import java.util.Date;

public class Masajista extends Persona {
    private String titulo;
    private int añosDeExperiencia;

    public Masajista(String nombre, String apellido, String estado, int numPasaporte, String fechaNacimiento,
            String titulo, int añosDeExperiencia) {
        super(nombre, apellido, estado, numPasaporte, fechaNacimiento);
        this.titulo = titulo;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

}
