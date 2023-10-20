package TP04.RegistroEmpresa;

import java.util.List;
import java.util.ArrayList;

public class Jerarquico extends Empresa {
    private List<String> empleadosACargo = new ArrayList<>();

    public Jerarquico(String nombre, String apellido, int edad, int legajo, int sueldo,
            List<String> empleadosACargo) {
        super("Jerarquico", nombre, apellido, edad);
        this.empleadosACargo = empleadosACargo;
    }

    public String showInfo() {
        if (super.existeCargo()) {
            return super.showInfo() + "\nLista de empleados a cargo: " + empleadosACargo;
        } else {
            return "No existe ese cargo";

        }
    }

    public List<String> getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(List<String> empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }
}
