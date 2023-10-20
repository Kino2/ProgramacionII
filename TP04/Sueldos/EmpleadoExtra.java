package TP04.Sueldos;

public class EmpleadoExtra extends Empleado {
    private double montoExtra;
    private int horasExtras;

    public EmpleadoExtra(String nombre, double salarioSemanal, int horasExtras) {
        super(nombre,salarioSemanal);
        this.montoExtra = 1500;
        this.horasExtras = horasExtras;
    }

    public double getMontoExtra() {
        return montoExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double calcularSalario() {
        return super.getSalarioSemanal() + (montoExtra * horasExtras);
    }
}
