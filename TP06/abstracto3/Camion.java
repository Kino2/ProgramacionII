package abstracto3;

import java.time.LocalDate;

public class Camion extends ElementoCola {
    private String nombre;
    private double capacidad;
    private LocalDate fechaCarga;
    
    public Camion(String nombre, double capacidad, LocalDate fechaCarga) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.fechaCarga = fechaCarga;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        LocalDate fecha1 = this.getFechaCarga();
        LocalDate fecha2 = ((Camion) otro).getFechaCarga();
        return fecha1.compareTo(fecha2)>0;
    }

    @Override
    public String toString() {
        return "Camion [nombre=" + nombre + ", capacidad=" + capacidad + ", fechaCarga=" + fechaCarga + "]";
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

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    
}
