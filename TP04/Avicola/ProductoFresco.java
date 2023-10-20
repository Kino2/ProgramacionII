package TP04.Avicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(LocalDate fechaVencimiento, int numLote,
            LocalDate fechaEnvasado, String granjaOrigen) {
                super(fechaVencimiento, numLote);
                this.fechaEnvasado = fechaEnvasado;
                this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String getEtiqueta(){
        return super.getEtiqueta() + "\nFecha de envasado: " +fechaEnvasado + "\n Granja de origen: " +granjaOrigen; 
    }
}
