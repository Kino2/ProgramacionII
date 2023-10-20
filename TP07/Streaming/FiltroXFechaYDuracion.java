package Streaming;

import java.time.LocalDate;

public class FiltroXFechaYDuracion extends Filtro {
    public boolean cumple(Pelicula peli) {
        LocalDate fechaLimite = LocalDate.of(2015, 1, 1);
        return peli.getEstreno().isBefore(fechaLimite) && peli.getDuracion() < 95;
    }
}
