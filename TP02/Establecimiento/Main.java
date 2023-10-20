package TP02.Establecimiento;

public class Main {
    public static void main (String [] args){
        Usuario usuario = new Usuario("Esteban", 2);
        Cancha cancha = new Cancha("Paddle");
        Establecimiento establecimiento = new Establecimiento();
        establecimiento.reservarTurno(usuario, cancha);
        System.out.println(establecimiento.esSocio(usuario));
    }
}
