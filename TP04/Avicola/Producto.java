package TP04.Avicola;

import java.time.LocalDate;

public class Producto {
    protected LocalDate fechaVencimiento;
    protected int numLote;

    public Producto(LocalDate fechaVencimiento, int numLote) {
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getEtiqueta() {
        return "Fecha de Vencimiento: " + fechaVencimiento + "\nNúmero de Lote: " + numLote;
    }
}
