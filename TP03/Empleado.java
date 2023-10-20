package TP03;

public class Empleado {
    private String nombre;
    private int encuestasRealizadas;

    public Empleado(String nombre, int encuestasRealizadas){
        this.nombre = nombre;
        this.encuestasRealizadas = encuestasRealizadas;
    }

    public void sumarEncuestaRealizada(){
        encuestasRealizadas++;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEncuestasRealizadas(){
        return encuestasRealizadas;
    }


}
