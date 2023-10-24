package Parcial2;

import java.util.ArrayList;

public class Tarea extends Componente {
    private ArrayList<String> matNecesarios;
    private Double costo;
    private int empleadosAfectados;
    private int tiempoEstimado;

    public Tarea(String nombre, ArrayList<String> matNecesarios, double costo, int empleadosAfectados,
            int tiempoEstimado) {
        super(nombre);
        this.matNecesarios = matNecesarios;
        this.costo = costo;
        this.empleadosAfectados = empleadosAfectados;
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public int getEmpleadosAfectados() {
        return empleadosAfectados;
    }

    @Override
    public ArrayList<String> getMatNecesarios() {
        return matNecesarios;
    }

    @Override
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public Componente copia() {
        return new Tarea(this.getNombre(), this.getMatNecesarios(),
                this.getCosto(), this.getEmpleadosAfectados(), this.getTiempoEstimado());
    }

    public Componente copia(Filtro f) {
        if (f.cumple(this)) {
            return new Tarea(this.getNombre(), this.getMatNecesarios(),
                    this.getCosto(), this.getEmpleadosAfectados(), this.getTiempoEstimado());
        } else {
            return null;
        }
    }

    public boolean equals(Object o) {
        Tarea t = (Tarea) o;
        try {
            return this.getNombre().equals(t.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Tarea [matNecesarios=" + matNecesarios + ", costo=" + costo + ", empleadosAfectados="
                + empleadosAfectados + ", tiempoEstimado=" + tiempoEstimado + "]";
    }
}
