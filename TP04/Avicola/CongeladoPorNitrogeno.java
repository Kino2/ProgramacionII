package TP04.Avicola;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladoPorNitrogeno(LocalDate fechaVencimiento, int numLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoOrganismo, Double tempMantenimiento, String metodoCongelacion, int tiempoExposicion) {
        super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    public String informacion() {
        return "Metodo de congelacion: " + metodoCongelacion + ", Tiempo de exposicion: " + tiempoExposicion;
    }
}
