package LogisticaMorgana;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete extends ElementoLM {
    private double costoEnvio;
    private double valorAsegurado;

    public Paquete(String destino, LocalDate fPartida, double costoEnvio, double valorAsegurado,
            String identificacion) {
        super(destino, fPartida, identificacion);
        this.costoEnvio = costoEnvio;
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public double getCostoEnvio() {
        return costoEnvio;
    }

    @Override
    public double getValorAsegurado() {
        return valorAsegurado;
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public Paquete getMayorPaquete() {
        return this;
    }

    @Override
    public ElementoLM copia() {
        Paquete copia = new Paquete(this.getDestino(), this.getfPartida(), this.getCostoEnvio(),
                this.getValorAsegurado(), this.getIdentificacion());
        return copia;
    }

    @Override
    public ArrayList<ElementoLM> busqueda(Filtro f) {
        ArrayList<ElementoLM> resultado = new ArrayList<>();
        if (f.cumple(this)) {
            resultado.add(this);
            return resultado;
        } else {
            return new ArrayList<>();
        }

    }

    @Override
    public String toString() {
        return "Paquete [costoEnvio=" + costoEnvio + ", valorAsegurado=" + valorAsegurado + "]";
    }

}
