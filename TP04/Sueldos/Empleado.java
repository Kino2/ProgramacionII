package TP04.Sueldos;

public class Empleado {
    protected String nombre;
    protected double salarioSemanal;

    public Empleado(String nombre, double salarioSemanal){
        this.nombre = nombre;
        this.salarioSemanal = salarioSemanal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public double calcularSalario(){
        return salarioSemanal;
    }
}
