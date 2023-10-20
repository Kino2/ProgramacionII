package TP04.Avicola;

import java.time.LocalDate;

public class CongeladoPorAgua extends ProductoCongelado {
    private double gramosSal;

    public CongeladoPorAgua(LocalDate fechaVencimiento, int numLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoOrganismo,
            Double tempMantenimiento, Double gramosSal) {
        super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.gramosSal = gramosSal;
    }

    public double getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(double gramosSal) {
        this.gramosSal = gramosSal;
    }

    public String infoSalinidad() {
        return ("Salinidad del agua: " + gramosSal + " gramos por litro");
    }

}
