package TP11.Parcial2021;

import java.time.LocalDate;

public class PaqueteSimple extends PaqueteTuristico{
    private String identificador;
    private String origen;
    private String destino;
    private double costo;
    private LocalDate fechaPagoAcordada;
    private String datosAlojamiento;

    public PaqueteSimple(String identificador, String origen, String destino, double costo, LocalDate fechaPagoAcordada,
            String datosAlojamiento) {
        this.identificador = identificador;
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaPagoAcordada = fechaPagoAcordada;
        this.datosAlojamiento = datosAlojamiento;
    }


}
