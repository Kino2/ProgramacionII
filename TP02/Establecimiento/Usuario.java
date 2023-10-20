package TP02.Establecimiento;

public class Usuario {
    private String nombre;
    private int turnosReservados;

    public Usuario(String nombre, int turnosReservados) {
        this.nombre = nombre;
        this.turnosReservados = turnosReservados;
    }

    public void registrarTurnos() {
        this.turnosReservados++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTurnos() {
        return this.turnosReservados;
    }
}
