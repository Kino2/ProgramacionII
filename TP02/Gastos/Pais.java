package TP02.Gastos;

import java.util.ArrayList;

public class Pais {
    String nombre;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Provincia> provincias;
    
    public Pais(String nombre, ArrayList<Ciudad> ciudades, ArrayList<Provincia> provincias){
        this.nombre = nombre;
        this.ciudades = ciudades;
        this.provincias = provincias;
    }
    
    public void ciudadesConDeficit(){
        ArrayList<String> ciudadConDeficit = new ArrayList<>();
        String ciudad;
        for(int i = 0; i < ciudades.size(); i++){
            if(ciudades.get(i).conDeficit()){
                ciudad = ciudades.get(i).getNombre();
                ciudadConDeficit.add(ciudad);
            }
        }
        System.out.println("Las ciudades con deficit son: " + ciudadConDeficit);
    }

    public void provinciasConDeficit(){
        ArrayList<String> provinciaConDeficit = new ArrayList<>();
        String provincia;
        for(int i = 0; i < provincias.size(); i++){
            if(provincias.get(i).conDeficit()){
                provincia = provincias.get(i).getNombre();
                provinciaConDeficit.add(provincia);
            }
        }
        System.out.println("Las provincias que tienen mas de la mitad de las ciudades con deficit son: " +provinciaConDeficit);
    }
    public String getNombre(){
        return this.nombre;
    }

}
