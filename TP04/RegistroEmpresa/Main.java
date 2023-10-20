package TP04.RegistroEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> empleados = new ArrayList<>();
        Empleado empleado = new Empleado("Alberto", "Rodriguez", 43, 26218, 75000);
        Empleado empleado2 = new Empleado("Rodrigo", "Rodriguez", 45, 91218, 100000);
        Empleado empleado3 = new Empleado("Santiago", "Rodriguez", 45, 91218, 100000);

        empleados.add(empleado.getNombre());
        empleados.add(empleado2.getNombre());
        empleados.add(empleado3.getNombre());
        
        Empresa empresa = new Empresa("Empleado", "Esteban", "Orellano", 20);
        System.out.println(empresa.showInfo());
        System.out.println();
        Jerarquico jerarquico = new Jerarquico("Nicolas", "Castro", 45, 91218, 100000, empleados);
        System.out.println(jerarquico.showInfo());
        System.out.println();
        System.out.println(empleado.showInfo());
        System.out.println();
        Usuario usuario = new Usuario("Karina", "Crego", 53, "KariCrego70", "hola1234");
        System.out.println(usuario.showInfo());

    }
}
