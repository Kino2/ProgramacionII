package TP04.Avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    private int codigoOrganismo;
    private LocalDate fechaEnvasado;
    private Double tempMantenimiento;
    private String granjaOrigen;

    public ProductoRefrigerado(LocalDate fechaVencimiento, int numLote, LocalDate fechaEnvasado,
            String granjaOrigen, int codigoOrganismo, Double tempMantenimiento) {
        super(fechaVencimiento, numLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.tempMantenimiento = tempMantenimiento;
        this.granjaOrigen = granjaOrigen;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(Double tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String getEtiqueta(){
        return super.getEtiqueta() + "\nFecha de envasado: " +fechaEnvasado + "\n Granja de origen: " +granjaOrigen +  
        "\nCódigo organismo de supervisión alimentaria: " +codigoOrganismo + "\nTemperatura de mantenimiento recomendada: " +tempMantenimiento;
    }
    
}
