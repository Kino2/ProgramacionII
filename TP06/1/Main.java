package TP06;

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){
        Item item = new Pelicula(3000.0, "Dark", "Terror", "Nolan", 1);
        Item item2 = new Vehiculo(1400, "Audi", "Electricos",60000, "K12BN");

        LocalDate fecha = LocalDate.of(2023, 9, 12);
        LocalDate fecha2 = LocalDate.of(2023, 7, 16);

        Alquiler alquiler = new Alquiler(item, fecha);
        Alquiler alquiler2 = new Alquiler(item2, fecha2);

        Cliente cliente = new Cliente("Esteban", 44357083);

        cliente.añadirAlquiler(alquiler);
        cliente.añadirAlquiler(alquiler2);
        
        System.out.println(cliente.tieneAlquileresVencidos());
    }
}
