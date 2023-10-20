package AlquiloAhora;


import java.util.ArrayList;
import java.util.Comparator;

public class Inventario extends Elemento {
    private double valorTotal;
    private int antiguedad;
    private String descripcion;

    public Inventario(double valorTotal, int antiguedad, int identificacion, String descripcion) {
        super(identificacion);
        this.valorTotal = valorTotal;
        this.antiguedad = antiguedad;
        this.descripcion = descripcion;
    }

    @Override
    public ArrayList<Inventario> busqueda(Filtro f, Comparator<Inventario> orden) {
        ArrayList<Inventario> retorno = new ArrayList<>();
        if (f.cumple(this)) {
            retorno.add(this);
        }
        return retorno;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValor(double valor) {
        this.valorTotal = valor;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Inventario [valorTotal=" + valorTotal + ", antiguedad=" + antiguedad + ", descripcion=" + descripcion
                + "]";
    }

}
