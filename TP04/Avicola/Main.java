package TP04.Avicola;

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){
        LocalDate fechaVencimiento = LocalDate.of(2023, 8, 31);
        LocalDate fechaEnvasado = LocalDate.of(2022, 8, 24);
        CongeladoPorAgua prodCongelado = new CongeladoPorAgua(fechaVencimiento, 912, fechaEnvasado, "Del norte", 27092, 33.0, 100.0);
        CongeladoPorAire prodCongAire = new CongeladoPorAire(fechaVencimiento, 187, fechaEnvasado, "Del sur", 26081, 47.2, 10.0, 25.0, 50.0, 22.0);
        System.out.println(prodCongAire.getEtiqueta());
        System.out.println();
        System.out.println(prodCongAire.composicionAire());
    }
}
