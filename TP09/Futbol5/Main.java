package Futbol5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear detalles de alquiler
        AlquilerCancha alquiler1 = new AlquilerCancha(13, 600.0);
        AlquilerCancha alquiler2 = new AlquilerCancha(13, 600.0);
        AlquilerCancha alquiler3 = new AlquilerCancha(1, 55.0);

        // Crear lista de alquileres para el primer socio
        ArrayList<AlquilerCancha> alquileresSocio1 = new ArrayList<>();
        alquileresSocio1.add(alquiler1);
        alquileresSocio1.add(alquiler2);

        // Crear lista de alquileres para el segundo socio
        ArrayList<AlquilerCancha> alquileresSocio2 = new ArrayList<>();
        alquileresSocio2.add(alquiler2);

        ArrayList<AlquilerCancha> alquileresSocio3 = new ArrayList<>();
        alquileresSocio3.add(alquiler3);

        // Crear socios
        Socio socio1 = new Socio("Juan", "Adam", 30, true, alquileresSocio1);
        Socio socio2 = new Socio("Ariana", "Grande", 25, true, alquileresSocio2);
        Socio socio3 = new Socio("Ernesto", "Zoma", 13, false, alquileresSocio2);
        Socio socio4 = new Socio("Arturo", "Zoma", 15, false, alquileresSocio2);

        // Mostrar información de los socios

        Sistema sistema = new Sistema();
        sistema.addSocio(socio3);
        sistema.addSocio(socio1);
        sistema.addSocio(socio2);
        sistema.addSocio(socio4);
;
        System.out.println(sistema.sociosPagoMasDe500());
    }
}
