package abstracto3;

public class Barco extends ElementoCola {
    private String nombre;
    private double capacidad;

    public Barco(String nombre, double capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getCapacidad() > ((Barco) otro).getCapacidad();
    }

    @Override
    public String toString() {
        return "Barco [nombre=" + nombre + ", capacidad=" + capacidad + "]";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    public void cargarBarco(Camion camion){
       System.out.println(camion + " Cargado en " + this); 
    }

}
