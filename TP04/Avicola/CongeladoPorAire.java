package TP04.Avicola;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoCongelado {
    private double porcNitrogeno;
    private double porcOxigeno;
    private double porcDioxidoDeCarbono;
    private double vaporDeAgua;

    public CongeladoPorAire(LocalDate fechaVencimiento, int numLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoOrganismo,
            Double tempMantenimiento, double porcNitrogeno, Double porcOxigeno, Double porcDioxidoDeCarbono,
            Double vaporDeAgua) {
                super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
                this.porcNitrogeno = porcNitrogeno;
                this.porcOxigeno = porcOxigeno;
                this.porcDioxidoDeCarbono = porcDioxidoDeCarbono;
                this.vaporDeAgua = vaporDeAgua;
    }

    public double getPorcNitrogeno() {
        return porcNitrogeno;
    }

    public void setPorcNitrogeno(double porcNitrogeno) {
        this.porcNitrogeno = porcNitrogeno;
    }

    public double getPorcOxigeno() {
        return porcOxigeno;
    }

    public void setPorcOxigeno(double porcOxigeno) {
        this.porcOxigeno = porcOxigeno;
    }

    public double getPorcDioxidoDeCarbono() {
        return porcDioxidoDeCarbono;
    }

    public void setPorcDioxidoDeCarbono(double porcDioxidoDeCarbono) {
        this.porcDioxidoDeCarbono = porcDioxidoDeCarbono;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(double vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }
    public String composicionAire(){
        return "La composición del aire está compuesta por:  Nitrogeno: " +porcNitrogeno+ "%" + 
                "\nOxigeno: " +porcOxigeno+ "%" +
                "\nDioxido de carbono: " +porcDioxidoDeCarbono+ "%" + 
                "\nVapor de agua: "+ vaporDeAgua + "%";
    }
}
