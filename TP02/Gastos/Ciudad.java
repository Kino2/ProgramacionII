package TP02.Gastos;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Double> impuestos;
    private double gastos;

    public Ciudad(String nombre, ArrayList<Double> impuestos, double gastos) {
        this.nombre = nombre;
        this.impuestos = impuestos;
        this.gastos = gastos;
    }

    public double montoRecaudado() {
        double totalRecaudado = 0;
        for (int i = 0; i < impuestos.size(); i++) {
            totalRecaudado += impuestos.get(i);
        }
        return totalRecaudado;
    }

    public boolean conDeficit() {
        return gastos > this.montoRecaudado();
    }

    public String getNombre(){
        return this.nombre;
    }
}
