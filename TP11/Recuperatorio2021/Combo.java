package TP11.Recuperatorio2021;

import java.util.ArrayList;

public class Combo extends ElementoBazar {
    protected String nombre;
    protected ArrayList<ElementoBazar> elementos;
    private Filtro filtro;
    private double descuento;
    private double descuentoMaximo;

    public Combo(String nombre, Filtro filtro, double descuento, double descuentoMaximo) {
        this.nombre = nombre;
        this.filtro = filtro;
        this.descuento = descuento;
        this.descuentoMaximo = descuentoMaximo;
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoBazar elemento) {
        if (filtro.cumple(elemento)) {
            elementos.add(elemento);
        } else {
            System.out.println("no cumple");
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ElementoBazar e : elementos) {
            ArrayList<String> categorias = e.getCategorias();
            for (String s : categorias) {
                if (!resultado.contains(s)) {
                    resultado.add(s);
                }
            }
        }
        return resultado;
    }

    @Override
    public double getPeso() {
        double peso = 0.0;
        for (ElementoBazar e : elementos) {
            peso += e.getPeso();
        }
        return peso;
    }

    @Override
    public double getPrecio() {
        int cantidad = this.getCantidad();
        double precio = 0.0;
        double precioTotal = 0.0;
        for (ElementoBazar e : elementos) {
            precio += e.getPrecio();
        }
        double descuentoTotal = cantidad * descuento;
        if (descuentoTotal > descuentoMaximo) {
            descuentoTotal = descuentoMaximo;
        }
        precioTotal = precio - (precio * descuentoTotal);
        return precioTotal;
    }

    @Override
    public Producto getMenor() {
        Producto menor = new Producto(Double.POSITIVE_INFINITY, 0.0);
        for (ElementoBazar e : elementos) {
            Producto prod = e.getMenor();
            if (menor.getPeso() > prod.getPeso()) {
                menor = prod;
            }
        }
        return menor;
    }

    @Override
    public int getCantidad() {
        int cantidad = 0;
        for (ElementoBazar e : elementos) {
            cantidad += e.getCantidad();
        }
        return cantidad;
    }

    @Override
    public ArrayList<ElementoBazar> busqueda(Filtro f) {
        ArrayList<ElementoBazar> resultado = new ArrayList<>();
        if (f.cumple(this)) {
            resultado.add(this);
        }
        for (ElementoBazar e : elementos) {
            resultado.addAll(e.busqueda(f));
        }
        return resultado;
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
            Combo copia = new Combo(this.getNombre(), this.getFiltro(), this.getDescuento(), this.getDescuentoMaximo());
            for (ElementoBazar b : elementos) {
                copia.addElemento(b);
            }
            return copia;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Combo [nombre=" + nombre + "]";
    }

    public Filtro getFiltro() {
        return filtro;
    }

    public ArrayList<ElementoBazar> getElementos() {
        return new ArrayList<>(elementos);
    }

    public double getDescuento() {
        return descuento;
    }

    public double getDescuentoMaximo() {
        return descuentoMaximo;
    }

}
