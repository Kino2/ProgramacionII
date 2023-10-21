package Parcial;

import java.util.ArrayList;

public abstract class Componente {
    protected String nombre;
    protected ArrayList<String> matNecesarios;
    protected double costo;
    protected int empleadosAfectados;
    protected int tiempoEstimado;

    public Componente(String nombre, ArrayList<String> matNecesarios, double costo, int empleadosAfectados,
            int tiempoEstimado) {
        this.nombre = nombre;
        this.matNecesarios = matNecesarios;
        this.costo = costo;
        this.empleadosAfectados = empleadosAfectados;
        this.tiempoEstimado = tiempoEstimado;
    }



    public abstract ArrayList<String> getMatNecesarios();

    public abstract double getCosto();

    public abstract int getEmpleadosAfectados();

    public abstract int getTiempoEstimado();



    public String getNombre() {
        return nombre;
    }

}
