import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoLN {
    //Atributos
    private String destino;
    private LocalDate fechaPartida;

    //Constructor
    public ElementoLN(String destino, LocalDate fechaPartida) {
        this.destino = destino;
        this.fechaPartida = fechaPartida;
    }

    //Metodos
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public abstract double getCostoEnvio();

    public abstract double getValorAsegurado();
    public abstract ArrayList<ElementoLN> getPaquetes();
    public abstract ElementoLN copia();

    public int getCantidad(){
        return 1;
    }
    public abstract ArrayList<Paquete> buscar(Condicion condicion);

    public abstract Paquete getMayorPaquete();

    public String toString(){
        return destino + "/" + fechaPartida;
    }
}
