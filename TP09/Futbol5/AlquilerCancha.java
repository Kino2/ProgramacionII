package Futbol5;

import java.time.LocalDate;

public class AlquilerCancha {
    private LocalDate fecha;
    private int idCancha;
    private double costo;

    public AlquilerCancha(int idCancha, double costo) {
        fecha = LocalDate.now();
        this.idCancha = idCancha;
        this.costo = costo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public double getCosto() {
        return costo;
    }


    
}
