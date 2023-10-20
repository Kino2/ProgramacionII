package TP04.Sueldos;

public class Main {
    public static void main (String [] args){
        Empleado empleado = new Empleado("Esteban", 20000);
        EmpleadoComision empleadoCom = new EmpleadoComision("Raul", 91218, 263, 0.4);
        EmpleadoExtra empleadoExtra = new EmpleadoExtra("Alberto", 70000, 5);

        System.out.println("Empleado normal");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Sueldo: " + empleado.calcularSalario());
        System.out.println();

        System.out.println("Empleado por comision");
        System.out.println("Nombre: " + empleadoCom.getNombre());
        System.out.println("Sueldo: " + empleadoCom.calcularSalario());
        System.out.println();

        System.out.println("Empleado por horas extras");
        System.out.println("Nombre: " + empleadoExtra.getNombre());
        System.out.println("Sueldo: " + empleadoExtra.calcularSalario());

    }

}
