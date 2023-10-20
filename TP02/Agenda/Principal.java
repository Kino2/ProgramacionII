package TP02.Agenda;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main (String [] args){
        Contacto contacto1 = new Contacto("Esteban", "kino@gmail.com", 580562);
        Contacto contacto2 = new Contacto("Sergio", "Sergio@hotmail.com", 620558);

        ArrayList<Contacto> participantes = new ArrayList<>();
        participantes.add(contacto1);
        participantes.add(contacto2);

        ArrayList<Reunion> reuniones = new ArrayList<>();
        Reunion reunion1 = new Reunion("Plaza", "Aborto", participantes, 2, new Date());
        Reunion reunion2 = new Reunion("Pabellon", "Manejo", participantes, 1, new Date());
        reuniones.add(reunion1);

        AgendaPersonal agenda = new AgendaPersonal(reuniones);

        if (agenda.agregarReunion(reunion2)) {
            System.out.println("Reunión agregada exitosamente.");
        } else {
            System.out.println("¡No se pudo agregar la reunión debido a un conflicto de horarios!");
        }
    }
}
