package TP04.Seleccion;

import java.util.Date;

public class Futbolista extends Persona {
    private String posicion;
    private String pieHabil;
    private int goles;

    public Futbolista(String nombre, String apellido, String estado, int numPasaporte,
            String fechaNacimiento, String posicion, String pieHabil, int goles) {

        super(nombre, apellido, estado, numPasaporte, fechaNacimiento);
        setPosicion(posicion);
        setPieHabil(pieHabil);
        this.goles = goles;
    }

    public void setPosicion(String posicion) {
        if (posicion.equals("Arquero") || posicion.equals("Defensor") || posicion.equals("Mediocampista")
                || posicion.equals("Delantero")) {
            this.posicion = posicion;
        } else {
            System.out.println("Posicion no válida");
        }
    }

    public void setPieHabil(String pieHabil) {
        if (pieHabil.equals("Izquierdo") || pieHabil.equals("Derecho")) {
            this.pieHabil = pieHabil;
        } else {
            System.out.println("Pie habil no válido");
        }
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public int getGoles() {
        return goles;
    }

}
