package TP04.Seleccion;

import java.util.Date;

public class Tecnico extends Persona {
    private String idFederacion;

    public Tecnico(String nombre, String apellido, String estado, int numPasaporte, String fechaNacimiento,
            String idFederacion) {
        super(nombre, apellido, estado, numPasaporte, fechaNacimiento);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

}
