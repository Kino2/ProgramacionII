package TP03;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<Pregunta> preguntas;
    private Persona persona;
    private Empleado empleado;
    private int vecesRealizada;

    public Encuesta(ArrayList<Pregunta> preguntas, Persona persona, Empleado empleado){
        this.preguntas = preguntas;
        this.persona = persona;
        this.empleado = empleado;
        vecesRealizada = 0;
    }

    public ArrayList<Pregunta> getPreguntas(){
        return preguntas;
    }

    public Persona getPersona(){
        return persona;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public int getVecesRealizada(){
        return vecesRealizada;
    }

    public void sumarVecesRealizada(){
        vecesRealizada++;
    }
}
