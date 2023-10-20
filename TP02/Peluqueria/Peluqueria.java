package TP02.Peluqueria;

import java.util.ArrayList;

public class Peluqueria {
    private ArrayList<Peluquero> peluqueros;
    private ArrayList<String> horariosDisponibles;

    public Peluqueria() {
        peluqueros = new ArrayList<>(4);
        horariosDisponibles = new ArrayList<>();
    }

    public void añadirPeluquero(Peluquero peluquero, Peluquero peluquero2, Peluquero peluquero3, Peluquero peluquero4) {
        peluqueros.add(peluquero);
        peluqueros.add(peluquero2);
        peluqueros.add(peluquero3);
        peluqueros.add(peluquero4);
    }

    public void asignarTurno(Peluquero peluquero, Cliente cliente, Turno turno) {
        double precio = peluquero.getPrecio();
        if (peluqueros.contains(peluquero) && (peluquero.getHorarios().contains(turno.getHorario()))) {
            if (esFrecuente(cliente)) {
                peluquero.setPrecio(precio *= 0.9);
            }
            cliente.agregarTurno();
        } else {
            System.out.println("No se ha podido asignar el turno");
        }
    }

    public boolean esFrecuente(Cliente cliente) {
        if (cliente.getTurnos() >= 1) {
            return true;
        }
        return false;
    }
}
