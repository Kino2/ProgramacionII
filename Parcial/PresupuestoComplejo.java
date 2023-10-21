package Parcial;

import java.util.ArrayList;

public class PresupuestoComplejo extends Componente {
    private ArrayList<Componente> componentes;
    private double descuento;

    public PresupuestoComplejo(String nombre, ArrayList<String> matNecesarios, double costo, int empleadosAfectados,
            int tiempoEstimado, double descuento) {
        super(nombre, matNecesarios, costo, empleadosAfectados, tiempoEstimado);
        componentes = new ArrayList<>();
        setDescuento(descuento);
    }

    public void addComponente(Componente c) {
        if (!componentes.contains(c)) {
            componentes.add(c);
        }
    }

    @Override
    public double getCosto() {
        double total = 0.0;
        for (Componente c : componentes) {
            total += c.getCosto();
        }
        return total - (total * descuento);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        if (descuento > 0.1 && descuento <= 1) {
            this.descuento = descuento;
        } else {
            this.descuento = 0.1;
        }
    }

    @Override
    public int getEmpleadosAfectados() {
        int mayorCant = -1;
        for (Componente c : componentes) {
            if (c.getEmpleadosAfectados() > mayorCant) {
                mayorCant = c.getEmpleadosAfectados();
            }
        }
        return mayorCant;
    }

    @Override
    public ArrayList<String> getMatNecesarios() {
        ArrayList<String> matNecesariosUnicos = new ArrayList<>();
        for (Componente c : componentes) {
            ArrayList<String> matNecesarios = c.getMatNecesarios();
            for (String s : matNecesarios) {
                if (!matNecesariosUnicos.contains(s)) {
                    matNecesariosUnicos.add(s);
                }
            }
        }
        return matNecesariosUnicos;
    }

    @Override
    public int getTiempoEstimado() {
        int tiempo = 0;
        for (Componente c : componentes) {
            tiempo += c.getTiempoEstimado();
        }
        return tiempo;
    }

    public boolean equals(Object o) {
        PresupuestoComplejo p = (PresupuestoComplejo) o;
        try {
            return this.getNombre().equals(p.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
