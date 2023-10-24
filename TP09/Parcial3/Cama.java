package Parcial3;

import java.util.ArrayList;

public class Cama extends Componente {
    private ArrayList<String> equipamiento;
    private boolean estaDisponible;
    private Paciente pacienteAsignado;

    public Cama(ArrayList<String> equipamiento) {
        this.equipamiento = equipamiento;
        estaDisponible = true;
        pacienteAsignado = null;
    }

    public void addPaciente(Paciente p, Requerimiento req) {
        if (estaDisponible && req.cumple(p)) {
            pacienteAsignado = p;
            estaDisponible = false;
        } else {
            System.out.println("La cama ya está ocupada o no cumple los requisitos");
        }
    }

    public Componente copia(Requerimiento req) {
        if (req.cumple(this.getPacienteAsignado())) {
            return new Cama(this.getEquipamiento());
        } else {
            return null;
        }
    }

    @Override
    public int getCantidadCamas() {
        return 1;
    }

    public ArrayList<String> getEquipamiento() {
        return equipamiento;
    }

    @Override
    public ArrayList<Cama> getCamasDisponibles() {
        ArrayList<Cama> disponibles = new ArrayList<>();
        if (this.isEstaDisponible()) {
            disponibles.add(this);
            return disponibles;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return "Cama [equipamiento=" + equipamiento + ", estaDisponible=" + estaDisponible + ", pacienteAsignado="
                + pacienteAsignado + "]";
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public Paciente getPacienteAsignado() {
        return pacienteAsignado;
    }

}
