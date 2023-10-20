package Futbol5;

import java.util.ArrayList;

public class FiltroPrecioMoroso extends Filtro {
    public boolean cumple(Socio socio) {
        boolean pagaUltimaCuota = socio.isPagaUltimaCuota();
        boolean pagoMasDe500 = false;
        ArrayList<AlquilerCancha> alquileres = socio.getInfoAlquileres();
        if(socio.isPagaUltimaCuota()){}
        for (int i = 0; i < alquileres.size(); i++) {
            AlquilerCancha alquiler = alquileres.get(i);
            if (alquiler.getCosto() > 500) {
                pagoMasDe500 = true;
                break;
            }
        }
        return !pagaUltimaCuota && pagoMasDe500;
    }
}
