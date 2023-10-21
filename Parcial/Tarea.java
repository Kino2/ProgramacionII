package Parcial;

import java.util.ArrayList;

public class Tarea extends Componente {

    public Tarea(String nombre, ArrayList<String> matNecesarios, double costo, int empleadosAfectados,
            int tiempoEstimado) {
        super(nombre, matNecesarios, costo, empleadosAfectados, tiempoEstimado);
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

    public boolean equals(Object o) {
        Tarea t = (Tarea) o;
        try {
            return this.getNombre().equals(t.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
