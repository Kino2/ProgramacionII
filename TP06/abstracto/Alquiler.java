package abstracto;

import java.time.LocalDate;

public class Alquiler {
    private Item item;
    private LocalDate fechaVencimiento;
    private LocalDate fechaActual;

    public Alquiler(Item item, LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        this.item = item;
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

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public boolean seVence(){
        return getFechaVencimiento().isBefore(getFechaActual());
    }
}
