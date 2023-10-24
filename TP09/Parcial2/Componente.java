package Parcial2;

import java.util.ArrayList;

public abstract class Componente {
    protected String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }



    public abstract ArrayList<String> getMatNecesarios();

    public abstract double getCosto();

    public abstract int getEmpleadosAfectados();

    public abstract int getTiempoEstimado();

    public abstract Componente copia();

    public abstract Componente copia(Filtro f);

    public String getNombre() {
        return nombre;
    }

}
