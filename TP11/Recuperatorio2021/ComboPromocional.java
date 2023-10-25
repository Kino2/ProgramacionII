package TP11.Recuperatorio2021;

import java.util.ArrayList;

public class ComboPromocional extends Combo {
    public ComboPromocional(String nombre, Filtro f, double descuento, double descuentoMaximo) {
        super(nombre, f, descuento, descuentoMaximo);
    }

    @Override
    public double getPrecio() {
        double precio = 0.0;
        for (ElementoBazar e : elementos) {
            precio += e.getPrecio();
        }
        return precio;
    }

    @Override
    public ElementoBazar copiaRestringida(Filtro f) {
        ArrayList<ElementoBazar> hijosQueCumplen = new ArrayList<>();
        for (ElementoBazar e : elementos) {
            ElementoBazar eHijo = e.copiaRestringida(f);
            if (eHijo != null) {
                hijosQueCumplen.add(eHijo);
            }
        }
        if (hijosQueCumplen.size() > 0) {
            ComboPromocional copia = new ComboPromocional(this.getNombre(), this.getFiltro(), this.getDescuento(),
                    this.getDescuentoMaximo());
            for (ElementoBazar b : elementos) {
                copia.addElemento(b);
            }
            return copia;
        } else {
            return null;
        }
    }
}
