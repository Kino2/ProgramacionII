package abstracto2;

public class Proceso extends ElementoCola {
    private String nombre;
    private double memoria;

    public Proceso(String nombre, double memoria) {
        this.nombre = nombre;
        this.memoria = memoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String ejecutar(){
        return "Proceso nombre = " + nombre + ", memoria = " + memoria + " ejecutado";
    }
    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getMemoria() > ((Proceso) otro).getMemoria();
    }

    @Override
    public String toString() {
        return "Proceso [nombre=" + nombre + ", memoria=" + memoria + "]";
    }

}
