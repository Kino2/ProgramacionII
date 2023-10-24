package Parcial3;

import java.util.ArrayList;

public class Compuesto extends Componente {
    private ArrayList<Componente> componentes;

    public Compuesto() {
        componentes = new ArrayList<>();
    }

    public void addComponente(Componente c) {
        if (!componentes.contains(c)) {
            componentes.add(c);
        }
    }

    @Override
    public ArrayList<Cama> getCamasDisponibles() {
        ArrayList<Cama> disponibles = new ArrayList<>();
        for (Componente c : componentes) {
            disponibles.addAll(c.getCamasDisponibles());
        }
        return disponibles;
    }

    @Override
    public int getCantidadCamas() {
        int camas = 0;
        for (Componente c : componentes) {
            camas += c.getCantidadCamas();
        }
        return camas;
    }

    @Override
    public Componente copia(Requerimiento req) {
        Compuesto copia = new Compuesto();
        for (Componente c : componentes) {
            Componente copiaHijo = c.copia(req);
            if (copiaHijo != null) {
                copia.addComponente(c.copia(req));
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
    public String toString() {
        return "Compuesto [componentes=" + componentes + "]";
    }

}
