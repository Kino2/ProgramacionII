package TP03;

import java.util.ArrayList;

public class Compañia {
    private ArrayList<Encuesta> encuestas;
    private Encuesta encuesta;
    private Empleado empleado;
    private Persona persona;
    private int cantidad;

    public Compañia(Encuesta encuesta, Empleado empleado, Persona persona,
            int cantidad) {
        this.encuestas = new ArrayList<>();
        this.encuesta = encuesta;
        this.empleado = empleado;
        this.persona = persona;
        this.cantidad = cantidad;
    }

    public void informatizarEncuesta() {
        if(cantidad < 1){
            empleado.sumarEncuestaRealizada();
            System.out.println(empleado.getEncuestasRealizadas());
            sumarCantidadRealizada();
            encuestas.add(encuesta);
        } else {
            System.out.println("Una persona no puede hacer la misma encuesta más de una vez");
        }
    }

    public void sumarCantidadRealizada() {
        cantidad++;
    }
}
