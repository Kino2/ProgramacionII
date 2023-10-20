package Futbol5;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getEdad() - socio2.getEdad();
    }
}
