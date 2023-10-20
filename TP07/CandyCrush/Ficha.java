package CandyCrush;

public class Ficha {
    private String tipo;
    private int fortaleza;
    private int espacio;
    private int poder;

    public Ficha(String tipo, int fortaleza, int espacio, int poder) {
        this.tipo = tipo;
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ficha [tipo=" + tipo + ", fortaleza=" + fortaleza + ", espacio=" + espacio + ", poder=" + poder + "]";
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public int getPoder() {
        return poder;
    }

    
}
