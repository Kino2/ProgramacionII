package abstracto;

public class Vehiculo extends Item {
    private String marca;
    private String patente;
    private String tipo;
    private double kms;
    private boolean estaDisponible;

    public Vehiculo(String marca, String patente, String tipo, double kms) {
        this.marca = marca;
        this.patente = patente;
        this.setTipo(tipo);
        this.kms = kms;
        this.estaDisponible = true;
    }
    
    public boolean puedeAlquilarse() {
        return estaDisponible;
    }
    public void alquilar() {
        this.estaDisponible = false;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("Electrico") || tipo.equalsIgnoreCase("Naftero") || tipo.equalsIgnoreCase("Diesel")) {
            this.tipo = tipo;
        }
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

}
