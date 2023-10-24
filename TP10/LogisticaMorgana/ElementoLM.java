package LogisticaMorgana;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoLM {
    private String destino;
    private LocalDate fPartida;
    private String identificacion;

    public ElementoLM(String destino, LocalDate fPartida, String identificacion) {
        this.destino = destino;
        this.fPartida = fPartida;
        this.identificacion = identificacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getfPartida() {
        return fPartida;
    }

    public void setfPartida(LocalDate fPartida) {
        this.fPartida = fPartida;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public abstract double getCostoEnvio();

    public abstract double getValorAsegurado();

    public abstract int getCantidad();

    public abstract Paquete getMayorPaquete();

    public abstract ElementoLM copia();

    public abstract ArrayList<ElementoLM> busqueda(Filtro f);
}