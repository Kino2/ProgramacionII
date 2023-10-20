package TP06;

public class Vehiculo extends Item {
    private String marca;
    private String tipo;
    private double kms;
    private String patente;
    private boolean estaDisponible;

    public Vehiculo(double precio, String marca, String tipo, double kms, String patente){
        super(precio);
        this.marca = marca;
        setTipo(tipo);
        this.kms = kms;
        this.patente = patente;
        estaDisponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("Electrico") || tipo.equals("Naftero") || tipo.equals("Diesel")){
            this.tipo = tipo;
        } else {
            System.out.println("No hay de ese tipo");
        }
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public boolean sePuedeAlquilar(){
        return estaDisponible;
    }

    public void alquilar(){
        estaDisponible = false;
    }
}
