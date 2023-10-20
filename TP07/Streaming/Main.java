package Streaming;

import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaEstreno = LocalDate.of(2008, 7, 24);
        ArrayList<String> actores = new ArrayList<>();

        actores.add("Katheryn Winnick");

        Pelicula peli = new Pelicula("Legend", "apocalipsis", "Drama", "Martin Scorsese", actores, fechaEstreno, 110, 20);
        Pelicula peli2 = new Pelicula("Leyenda en la luna", "apocalipsis", "Terror", "martin scorsese", actores, fechaEstreno, 110, 20);
        FiltroXActores filtro = new FiltroXActores();
        Plataforma plataforma = new Plataforma();
        plataforma.addPeliculas(peli2);
        plataforma.addPeliculas(peli);
        System.out.println(plataforma.filtrarPeliculas(filtro));
    }
}
