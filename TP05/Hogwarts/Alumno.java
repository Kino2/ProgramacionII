package TP05.Hogwarts;
import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<String> cualidades = new ArrayList<>();
    private ArrayList<String> familiares = new ArrayList<>();
    private Casa casa;

    public Alumno(String nombre, ArrayList<String> cualidades,ArrayList<String> familiares, Casa casa){
        super(nombre);
        this.cualidades = cualidades;
        this.familiares = familiares;
        this.casa = casa;
    }

    public Casa getCasa() {
        return casa;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public ArrayList<String> getFamiliares() {
        return familiares;
    }

    
}
