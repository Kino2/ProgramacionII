package TP02.Peluqueria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creo la peluqueria
        Peluqueria peluqueria = new Peluqueria();

        // Creo el cliente
        Cliente cliente = new Cliente("Esteban", 1);

        // Creo una lista con los horarios disponibles de los peluqueros
        ArrayList<String> horarios = new ArrayList<>();
        ArrayList<String> horarios2 = new ArrayList<>();
        horarios.add("16:30");
        horarios.add("00:00");
        horarios2.add("12:30");
        horarios2.add("23:00");

        // Creo los peluqueros
        Peluquero peluquero = new Peluquero("Lucho", horarios, 1200.0);
        Peluquero peluquero2 = new Peluquero("Martin", horarios2, 1100.0);
        Peluquero peluquero3 = new Peluquero("Alberto", horarios, 1150.0);
        Peluquero peluquero4 = new Peluquero("Nacho", horarios, 1300.0);

        // Creo el turno
        Turno turno = new Turno(cliente, "23:00");

        // Pruebo el sistema
        peluqueria.añadirPeluquero(peluquero, peluquero2, peluquero3, peluquero4);
        peluqueria.asignarTurno(peluquero2, cliente, turno);
        System.out.println("$" + peluquero2.getPrecio());
        System.out.println(cliente.getTurnos());
    }
}
