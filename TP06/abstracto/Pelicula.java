package abstracto;

public class Pelicula extends Item {
    private String infoFilmografica;
    private int cantCopias;

    public Pelicula(String infoFilmografica, int cantCopias) {
        this.infoFilmografica = infoFilmografica;
        this.cantCopias = cantCopias;
    }

    public boolean puedeAlquilarse() {
        if (this.cantCopias > 0) {
            return true;
        }
        return false;
    }

    public void alquilar() {
        cantCopias--;
    }

    public String getInfoFilmografica() {
        return infoFilmografica;
    }

    public void setInfoFilmografica(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

}
