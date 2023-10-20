package TP02.Peluqueria;

import java.util.ArrayList;

public class Peluquero {
    private String nombre;
    private ArrayList<String> horariosDisponibles;
    private double precio;

    public Peluquero(String nombre, ArrayList<String> horariosDisponibles, double precio) {
        this.nombre = nombre;
        this.horariosDisponibles = horariosDisponibles;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<String> getHorarios() {
        return horariosDisponibles;
    }

    public String getNombre() {
        return this.nombre;
    }
}
