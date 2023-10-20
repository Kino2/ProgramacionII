package Futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pagaUltimaCuota;
    private ArrayList<AlquilerCancha> infoAlquileres;

    public Socio(String nombre, String apellido, int edad, boolean pagaUltimaCuota,
            ArrayList<AlquilerCancha> infoAlquileres) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pagaUltimaCuota = pagaUltimaCuota;
        this.infoAlquileres = infoAlquileres;
    }

    public int cantAlquilerC13() {
        int contador = 0;
        for (int i = 0; i < infoAlquileres.size(); i++) {
            AlquilerCancha alquiler = infoAlquileres.get(i);
            if (alquiler.getIdCancha() == 13) {
                contador++;
            }
        }
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPagaUltimaCuota() {
        return pagaUltimaCuota;
    }

    public ArrayList<AlquilerCancha> getInfoAlquileres() {
        return infoAlquileres;
    }

    @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", pagaUltimaCuota="
                + pagaUltimaCuota + ", infoAlquileres=" + infoAlquileres + "]";
    }

}
