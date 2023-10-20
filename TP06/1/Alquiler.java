package TP06;

import java.time.LocalDate;

public class Alquiler {
    private Item item;
    private LocalDate fechaVencimiento;
    private LocalDate fechaActual;
    
    public Alquiler(Item item, LocalDate fechaVencimiento) {
        this.item = item;
        this.fechaVencimiento = fechaVencimiento;
        fechaActual = LocalDate.now();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean vence(){
        return fechaVencimiento.equals(fechaActual);
    }
    
}
