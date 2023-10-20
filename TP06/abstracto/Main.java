package abstracto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2023, 9, 23);
        LocalDate fecha2 = LocalDate.of(2023, 8, 14);

        Item item = new Vehiculo("Ford", "EA213", "electrico", 2000);
        Item item2 = new Vehiculo("Chevrolet", "EA213", "chupamelapija", 2000);

        Alquiler alquiler = new Alquiler(item, fecha);
        Alquiler alquiler2 = new Alquiler(item2, fecha2);

        Cliente cliente = new Cliente();

        item.alquilar();
        cliente.addAlquiler(alquiler);
        cliente.addAlquiler(alquiler2);

        System.out.println(cliente.tieneAlquileresVencidos()); 
    }
}
