package TP06;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private ArrayList<Alquiler> alquileres;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void añadirAlquiler(Alquiler alquiler){
        if(!alquileres.contains(alquiler)){
            alquileres.add(alquiler);
        } 
    }
    
    public boolean tieneAlquileresVencidos(){
        for(int i = 0; i<alquileres.size(); i++){
            if(alquileres.get(i).vence()){
                return true;
            }
        }
        return false;
    }
}
