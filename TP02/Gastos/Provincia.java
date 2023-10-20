package TP02.Gastos;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
        this.nombre = nombre;
        this.ciudades = ciudades;
    }

    public boolean conDeficit(){
        int cantCiudadesDeficit = 0;
        for(int i = 0; i<ciudades.size(); i++){
            if(ciudades.get(i).conDeficit()){
                cantCiudadesDeficit++;
            }
        }
        return cantCiudadesDeficit > ciudades.size()/2;
    }

    public String getNombre(){
        return this.nombre;
    }
}
