package TP02.Peluqueria;

public class Cliente {
    private String nombre;
    private int turnosReservados;

    public Cliente(String nombre, int turnosReservados) {
        this.nombre = nombre;
        this.turnosReservados = turnosReservados;
    }

    public void agregarTurno() {
        turnosReservados++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTurnos() {
        return turnosReservados;
    }
}
