package TP05.Sombrero;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;

    public Alumno(String nombre, ArrayList<String> cualidades, ArrayList<Alumno> familiares){
        this.nombre  = nombre;
        this.cualidades = cualidades;
        this.familiares = familiares;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }

    public ArrayList<Alumno> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Alumno> familiares) {
        this.familiares = familiares;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
