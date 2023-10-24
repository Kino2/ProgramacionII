package Parcial3;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private int edad;
    private ArrayList<String> sintomas;
    private ArrayList<String> equipamientoNecesario;

    public Paciente(String nombre, int edad, ArrayList<String> sintomas, ArrayList<String> equipamientoNecesario) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
        this.equipamientoNecesario = equipamientoNecesario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
    }

    public ArrayList<String> getEquipamientoNecesario() {
        return equipamientoNecesario;
    }

    public void setEquipamientoNecesario(ArrayList<String> equipamientoNecesario) {
        this.equipamientoNecesario = equipamientoNecesario;
    }

    
}
