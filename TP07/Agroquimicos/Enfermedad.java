package Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        estadosPatologicos = new ArrayList<>();
    }

    public void addEstadoPatalogico(String e) {
        if (!estadosPatologicos.contains(e)) {
            estadosPatologicos.add(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

}
