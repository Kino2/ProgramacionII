package Agroquimicos;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private ArrayList<Cultivo> cultivosDesaconsejados;
    private ArrayList<String> estadosPatologicos;

    public Producto(String nombre) {
        this.nombre = nombre;
        cultivosDesaconsejados = new ArrayList<>();
        estadosPatologicos = new ArrayList<>();
    }

    public void addCultivoDesaconsejado(Cultivo cultivo){
        cultivosDesaconsejados.add(cultivo);
    }

    public void addEstadoPatalogico(String e) {
		if(!estadosPatologicos.contains(e)) {
			estadosPatologicos.add(e);
		}
	}

    public boolean seDesaconseja(Cultivo cultivo) {
        return cultivosDesaconsejados.contains(cultivo);
    }

    public boolean trataEnfermedad(Enfermedad enfermedad) {
        return estadosPatologicos.containsAll(enfermedad.getEstadosPatologicos());
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cultivo> getCultivosDesaconsejados() {
        return cultivosDesaconsejados;
    }

    public ArrayList<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

}
