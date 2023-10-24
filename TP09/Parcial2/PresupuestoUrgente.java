package Parcial2;

import java.util.ArrayList;

public class PresupuestoUrgente extends Componente {
    private static double aumentoCosto = 0.5;
    private ArrayList<Componente> componentes;

    public PresupuestoUrgente(String nombre) {
        super(nombre);
        componentes = new ArrayList<>();
    }

    public static double getAumentoCosto() {
        return aumentoCosto;
    }

    public static void setAumentoCosto(double aumentoCosto) {
        PresupuestoUrgente.aumentoCosto = aumentoCosto;
    }

    public void addComponente(Componente c) {
        if (!componentes.contains(c)) {
            componentes.add(c);
        }
    }

    public int calcularTiempo() {
        int tiempo = -1;
        for (Componente c : componentes) {
            if (c.getTiempoEstimado() > tiempo) {
                tiempo = c.getTiempoEstimado();
            }
        }
        return tiempo;
    }

    @Override
    public double getCosto() {
        double costo = 0.0;
        for (Componente c : componentes) {
            costo += c.getCosto();
        }
        return costo + (costo * aumentoCosto);
    }

    @Override
    public int getEmpleadosAfectados() {
        int afectados = 0;
        for (Componente c : componentes) {
            afectados += c.getEmpleadosAfectados();
        }
        return afectados;
    }

    @Override
    public ArrayList<String> getMatNecesarios() {
        ArrayList<String> matNecesariosConRepetidos = new ArrayList<>();
        for (Componente c : componentes) {
            matNecesariosConRepetidos.addAll(c.getMatNecesarios());
        }
        return matNecesariosConRepetidos;
    }

    public Componente copia() {
        PresupuestoUrgente copia = new PresupuestoUrgente(this.getNombre());
        for (Componente c : componentes) {
            copia.addComponente(c.copia());
        }
        return copia;
    }

    public Componente copia(Filtro f) {
        PresupuestoUrgente copia = new PresupuestoUrgente(this.getNombre());
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

    @Override
    public int getTiempoEstimado() {
        int tiempo = -1;
        for (Componente c : componentes) {
            if (c.getTiempoEstimado() > tiempo) {
                tiempo = c.getTiempoEstimado();
            }
        }
        return tiempo;
    }

    @Override
    public String toString() {
        return "PresupuestoUrgente [componentes=" + componentes + "]";
    }

}
