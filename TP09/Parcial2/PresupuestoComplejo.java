package Parcial2;

import java.util.ArrayList;

public class PresupuestoComplejo extends Componente {
    private ArrayList<Componente> componentes;
    private double descuento;

    public PresupuestoComplejo(String nombre, double descuento) {
        super(nombre);
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
        ArrayList<String> matNecesarios = new ArrayList<>();
        for (Componente c : componentes) {
            ArrayList<String> matNecesariosUnicos = c.getMatNecesarios();
            for (String s : matNecesariosUnicos) {
                if (!matNecesarios.contains(s)) {
                    matNecesarios.add(s);
                }
            }
        }
        return matNecesarios;
    }


    @Override
    public int getTiempoEstimado() {
        int tiempo = 0;
        for (Componente c : componentes) {
            tiempo += c.getTiempoEstimado();
        }
        return tiempo;
    }

    public Componente copia() {
        PresupuestoComplejo copia = new PresupuestoComplejo(this.getNombre(), this.getDescuento());
        for (Componente c : componentes) {
            copia.addComponente(c.copia());
        }
        return copia;
    }

    public Componente copia(Filtro f) {
        PresupuestoComplejo copia = new PresupuestoComplejo(this.getNombre(), this.getDescuento());
        for (Componente c : componentes) {
            Componente copiaHijo = c.copia(f);
            if (copiaHijo != null) {
                copia.addComponente(c.copia(f));
            }
        }
        if (copia.tieneComponentes()) {
            return copia;
        } else {
            return null;
        }
    }

    public boolean tieneComponentes() {
        return !componentes.isEmpty();
    }

    public boolean equals(Object o) {
        PresupuestoComplejo p = (PresupuestoComplejo) o;
        try {
            return this.getNombre().equals(p.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "PresupuestoComplejo [componentes=" + componentes + ", matNecesarios=" + getMatNecesarios() + ", descuento="
                + descuento + "]";
    }
}
