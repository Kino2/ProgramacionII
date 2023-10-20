package TP04.RegistroEmpresa;

public class Empresa {
    protected String cargo;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Empresa(String cargo, String nombre, String apellido, int edad) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public boolean existeCargo(){
        if(cargo.equals("Empleado") || cargo.equals("Usuario final") || cargo.equals("Jerarquico")){
            return true;
    } else {
        return false;
    }
}

    public String showInfo(){
        if(existeCargo()){
            return "\nCargo: " + cargo + "\nNombre: " + nombre + "\nApellido: " + apellido +"\nEdad: " + edad;
        } else {
            return "No existe ese cargo";
        }
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
}
