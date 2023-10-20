package Futbol5;

import java.util.Comparator;

public class ComparadorCancha implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        int alquileresCancha13Socio1 = socio1.cantAlquilerC13();
        int alquileresCancha13Socio2 = socio2.cantAlquilerC13();
        return alquileresCancha13Socio2 - alquileresCancha13Socio1;
    }
}