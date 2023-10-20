package Futbol5;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getApellido().compareTo(socio2.getApellido());
    }
}
