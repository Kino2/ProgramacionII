package Streaming;

import java.util.ArrayList;

public class FiltroXActores extends Filtro {
    public boolean cumple(Pelicula peli) {
        ArrayList<String> actores = peli.getActores();
        return actores.contains("Will Smith") && !peli.getDirector().equals("Martin Scorsese");
    }
}
