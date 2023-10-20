package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        enfermedades = new ArrayList<>();
    }

    public void addEnfermedad(Enfermedad enfermedad){
        if(!enfermedades.contains(enfermedad)){
            enfermedades.add(enfermedad);
        }
    }

    public boolean puedeTratarEnfermedad(Producto quimico) {
        for (int i = 0; i < enfermedades.size(); i++) {
            Enfermedad enfermedad = enfermedades.get(i);
            if(quimico.trataEnfermedad(enfermedad) && !quimico.seDesaconseja(this)){
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }
}
