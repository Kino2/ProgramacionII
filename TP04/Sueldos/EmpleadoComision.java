package TP04.Sueldos;

public class EmpleadoComision extends Empleado {
    private int ventas;
    private double porcentaje;
    private double montoVenta;

    public EmpleadoComision(String nombre, double salarioSemanal, int ventas, double porcentaje){
        super(nombre, salarioSemanal);
        this.ventas = ventas;
        this.porcentaje = porcentaje;
        montoVenta = 1927;
    }

    public int getVentas() {
        return ventas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double calcularSalario(){
        return super.getSalarioSemanal() + ((ventas * montoVenta) * porcentaje);
    }
}
