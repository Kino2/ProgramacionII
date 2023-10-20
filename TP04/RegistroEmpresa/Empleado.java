package TP04.RegistroEmpresa;

public class Empleado extends Empresa {
    private int legajo;
    private int sueldo;

    public Empleado(String nombre, String apellido, int edad, int legajo, int sueldo) {
        super("Empleado", nombre, apellido, edad);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String showInfo() {
        if (super.existeCargo()) {
            return super.showInfo() + "\nN° De legajo: " + legajo + "\nSueldo: " + "$" + sueldo;
        } else {
            return "No existe ese cargo";
        }
    }
}