package TP03;

public class Persona {
    private String nombre;
    private int documento;

    public Persona(String nombre, int documento){
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre (){
        return nombre;
    }

    public int getDocumento(){
        return documento;
    }
}
