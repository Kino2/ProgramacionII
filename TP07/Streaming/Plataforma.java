package Streaming;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;

    public Plataforma() {
        peliculas = new ArrayList<>();
    }

    public void addPeliculas(Pelicula peli) {
        if (!peliculas.contains(peli) && esRentable(peli)) {
            peliculas.add(peli);
        } else {
            System.out.println("No se ha podido agregar la pelicula porque no es rentable o ya fue asignada anteriormente");
        }
    }

    public boolean esRentable(Pelicula peli) {
        LocalDate fechaLimite = LocalDate.of(2017, 12, 31);
        if (peli.getDuracion() < 120 && !peli.getGenero().equalsIgnoreCase("comedia")) {
            return true;
        } else if (peli.getEstreno().isAfter(fechaLimite) || peli.getGenero().equalsIgnoreCase("infantil")
                || peli.getGenero().equalsIgnoreCase("documental")) {
                    return true;
        } else {
            return false;
        }
    }

    public ArrayList<Pelicula> filtrarPeliculas(Filtro f) {
        ArrayList<Pelicula> retorno = new ArrayList<>();
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula peli = peliculas.get(i);
            if (f.cumple(peli)) {
                retorno.add(peli);
            }
        }
        return retorno;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
