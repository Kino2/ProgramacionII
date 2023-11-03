package TP11.Parcial2021;

import java.time.LocalDate;

public class PaqueteSimple extends PaqueteTuristico{
    private String identificador;
    private String origen;
    private String destino;
    private double costo;
    private LocalDate fechaPago;
    private String datosAlojamiento;

    public PaqueteSimple(String identificador, String origen, String destino, double costo, LocalDate fechaPago,
            String datosAlojamiento) {
        this.identificador = identificador;
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaPago = fechaPago;
        this.datosAlojamiento = datosAlojamiento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getCosto() {
        return costo;
    }

    public LocalDate getFecha() {
        return fechaPago;
    }

    public String getDatosAlojamiento() {
        return datosAlojamiento;
    }


}
