package TP02.Agenda;

import java.util.ArrayList;


public class AgendaPersonal {
    private ArrayList<Reunion> reuniones;

    public AgendaPersonal(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    public boolean agregarReunion(Reunion reunion) {
        if (!conflictoFecha(reunion)) {
            reuniones.add(reunion);
            return true; // La reunión se agregó exitosamente
        } else {
            return false; // Hubo conflicto de horario, la reunión no se agregó
        }
    }
    public boolean conflictoFecha (Reunion reunionNueva){
        for(int i = 0; i < reuniones.size(); i++){
            if(reuniones.get(i).getFecha().equals(reunionNueva.getFecha())){
                return true;
            }
        }
        return false;
    }
}
