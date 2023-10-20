package AlquiloAhora;

import java.util.Comparator;

public class Comparador implements Comparator<Inventario> {
    public int compare(Inventario i, Inventario i2) {
        int comparacion = i.getIdentificacion() - i2.getIdentificacion();
        if (comparacion == 0) {
            return i.getAntiguedad() - i2.getAntiguedad();
        }
        return comparacion;
    }
}
