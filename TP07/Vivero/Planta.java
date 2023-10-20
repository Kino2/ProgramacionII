package Vivero;

import java.util.ArrayList;

public class Planta {
    private String nombre;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String prosperaEn;
    private int riego;
    private int sol;

    public Planta(String nombre, ArrayList<String> nombresVulgares, String clasificacionSuperior, String familia,
            String clase, String prosperaEn, int riego, int sol) {
        this.nombre = nombre;
        this.nombresVulgares = nombresVulgares;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        setProsperaEn(prosperaEn);
        setRiego(riego);
        setSol(sol);
    }

    public String getProsperaEn() {
        return prosperaEn;
    }

    public void setProsperaEn(String prosperaEn) {
        if(prosperaEn.equalsIgnoreCase("Interior")){
            this.prosperaEn = prosperaEn;
        } else if (prosperaEn.equalsIgnoreCase("Exterior")){
            this.prosperaEn = prosperaEn;
        } else {
            prosperaEn.equals("Interior");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getNombresVulgares() {
        return nombresVulgares;
    }

    public void setNombresVulgares(ArrayList<String> nombresVulgares) {
        this.nombresVulgares = nombresVulgares;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        if (riego >= 1 && riego <= 10) {
            this.riego = riego;
        } else {
            this.riego = 1;
        }
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        if (sol >= 1 && sol <= 10) {
            this.sol = sol;
        } else {
            this.sol = 1;
        }
    }

}
