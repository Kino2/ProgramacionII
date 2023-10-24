import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete extends ElementoLN{
    //Atributos
    private double costoEnvio;
    private double valorAsegurado;

    //Constructor
    public Paquete(String destino, LocalDate fechaPartida, double costoEnvio, double valorAsegurado) {
        super(destino, fechaPartida);
        this.costoEnvio = costoEnvio;
        this.valorAsegurado = valorAsegurado;
    }

    //Metodos
    @Override
    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double getValorAsegurado() {
        return valorAsegurado;
    }

    public void setValorAsegurado(double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public ArrayList<ElementoLN> getPaquetes(){
        ArrayList<ElementoLN> resultado = new ArrayList<>();
        resultado.add(this);
        return resultado;
    }

    @Override
    public String toString(){
        return "Paquete/"+ super.toString() + "(" + costoEnvio + ", " + valorAsegurado + ")";
    }

    @Override
    public ArrayList<Paquete> buscar(Condicion condicion) {
        ArrayList<Paquete> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado; 
    }

    @Override
    public Paquete getMayorPaquete() {
        return this;
    }

    public boolean acepta(){
        return false;
    }

    @Override
    public ElementoLN copia() {
        Paquete copia = new Paquete(this.getDestino(), this.getFechaPartida(),
        this.getCostoEnvio(), this.getValorAsegurado());
        return copia;
    }
}