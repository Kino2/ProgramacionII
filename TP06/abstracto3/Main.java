package abstracto3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        Barco barco = new Barco("Ea", 400);
        Barco barco2 = new Barco("ae", 100);

        LocalDate fecha1 = LocalDate.of(2023, 9, 25);
        LocalDate fecha2 = LocalDate.of(2023, 6, 25);

        Camion camion = new Camion("eltroncha", 200, fecha1);
        Camion camion2 = new Camion("Sabalero", 210, fecha2);

        puerto.addBarco(barco2);
        puerto.addBarco(barco);

        puerto.addCamion(camion);
        puerto.addCamion(camion2);
    }
}
