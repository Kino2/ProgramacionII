package TP02.Peluqueria;

public class Turno {
    private Cliente cliente;
    private String horario;

    public Turno(Cliente cliente, String horario) {
        this.cliente = cliente;
        this.horario = horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getHorario() {
        return horario;
    }
}
