package TP06;

public class Pelicula extends Item {
    private String nombre;
    private String genero;
    private String director;
    private int cantCopias;

    public Pelicula(double precio, String nombre, String genero, String director, int cantCopias) {
        super(precio);
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.cantCopias = cantCopias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    public void alquilar() {
        cantCopias--;
    }

    public boolean sePuedeAlquilar() {
        return this.getCantCopias() > 0;
    }
}
