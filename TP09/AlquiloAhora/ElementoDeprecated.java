package AlquiloAhora;

import java.util.ArrayList;
import java.util.Comparator;

public class ElementoDeprecated extends Elemento {
    private int identificacion;
    private Elemento elemento;
    private int mesesEnvejecimiento;
    private double descuentoPorMes;

    public ElementoDeprecated(int identificacion, Elemento elemento, int mesesEnvejecimiento,
            double descuentoPorMes) {
        this.identificacion = identificacion;
        this.elemento = elemento;
        this.mesesEnvejecimiento = mesesEnvejecimiento;
        this.descuentoPorMes = descuentoPorMes;
    }

    public boolean estaVigente() {
        return elemento.getAntiguedad() < mesesEnvejecimiento;
    }

    public int getAntiguedad() {
        return elemento.getAntiguedad();
    }

    @Override
    public ArrayList<Inventario> busqueda(Filtro f, Comparator<Inventario> orden) {
        if (estaVigente()) {
            return elemento.busqueda(f, orden);
        }
        return new ArrayList<>();
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public double getValorTotal() {
        double valorTotal = elemento.getValorTotal();
        int mesesDiferencia = 0;
        if (estaVigente()) {
            return valorTotal;
        } else {
            mesesDiferencia = elemento.getAntiguedad() - mesesEnvejecimiento;
            valorTotal = valorTotal - (mesesDiferencia * descuentoPorMes * valorTotal);
            return valorTotal;
        }
    }

    public Elemento getElemento() {
        return elemento;
    }

    public int getMesesEnvejecimiento() {
        return mesesEnvejecimiento;
    }

    public double getDescuentoPorMes() {
        return descuentoPorMes;
    }

}
