package TP11.Recuperatorio;

import java.util.ArrayList;

public class Suscriptor {
    private String apellido;
    private String email;
    private ArrayList<Noticia> noticiasRecibidas;
    private String nombre;
    private Filtro interes;

    public Suscriptor(String apellido, String email, String nombre, Filtro interes) {
        this.apellido = apellido;
        this.email = email;
        this.nombre = nombre;
        this.interes = interes;
        noticiasRecibidas = new ArrayList<>();
    }

    public void cambiarInteres(Filtro nuevoInteres) {
        this.interes = nuevoInteres;
    }

    public void recibirNoticia(Noticia noticia){
        if(interes.cumple(noticia)){
            this.noticiasRecibidas.add(noticia);
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Filtro getInteres() {
        return interes;
    }

    public void setInteres(Filtro interes) {
        this.interes = interes;
    }

}
