package AlquiloAhora;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Elemento {
    private int identificacion;

    public Elemento(){
        
    }
    public Elemento(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public abstract double getValorTotal();

    public abstract int getAntiguedad();

    public abstract ArrayList<Inventario> busqueda(Filtro f, Comparator<Inventario> orden);

}
