package LogisticaMorgana;

import java.time.LocalDate;
import java.util.ArrayList;

public class Combo extends ElementoLM {
    private double costoEnvio;
    private double valorAsegurado;
    private ArrayList<ElementoLM> elementos;
    private Restriccion restriccion;

    public Combo(String destino, LocalDate fPartida, String identificacion, Restriccion restriccion) {
        super(destino, fPartida, identificacion);
        this.restriccion = restriccion;
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoLM elemento) {
        if (!elementos.contains(elemento) && restriccion.cumple(this, elemento)) {
            elementos.add(elemento);
        } else {
            System.out.println("No se ha podido agregar");
        }
    }

    public double getCostoEnvio() {
        costoEnvio = 0.0;
        for (ElementoLM e : elementos) {
            costoEnvio += e.getCostoEnvio();
        }
        return costoEnvio;
    }

    public double getValorAsegurado() {
        valorAsegurado = 0.0;
        for (ElementoLM e : elementos) {
            valorAsegurado += e.getValorAsegurado();
        }
        return valorAsegurado;
    }

    @Override
    public int getCantidad() {
        int cantidad = 0;
        for (ElementoLM e : elementos) {
            cantidad += e.getCantidad();
        }
        return cantidad;
    }

    public Paquete getMayorPaquete() {
        Paquete paquete = new Paquete(null, null, 0.0, 0.0, null);
        for (int i = 0; i < elementos.size(); i++) {
            ElementoLM elemHijo = elementos.get(i);
            if (elemHijo.getValorAsegurado() > paquete.getValorAsegurado()) {
                paquete = elemHijo.getMayorPaquete();
            }
        }
        return paquete;
    }

    @Override
    public ElementoLM copia() {
        Combo copia = new Combo(this.getDestino(), this.getfPartida(), this.getIdentificacion(), this.getRestriccion());
        for (ElementoLM e : elementos) {
            copia.addElemento(e.copia());
        }
        return copia;
    }

    @Override
    public ArrayList<ElementoLM> busqueda(Filtro f) {
        ArrayList<ElementoLM> resultado = new ArrayList<>();
        for (ElementoLM e : elementos) {
            resultado.addAll(e.busqueda(f));
        }
        return resultado;
    }

    public double setCostoEnvioPromedio() {
        for (ElementoLM e : elementos) {
            costoEnvio += e.getCostoEnvio();
        }
        costoEnvio = costoEnvio/elementos.size();
        return costoEnvio;
    }

    public Restriccion getRestriccion() {
        return restriccion;
    }

    public boolean equals(Object o) {
        Combo c = (Combo) o;
        try {
            return this.getIdentificacion().equals(c.getIdentificacion());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Combo [elementos=" + elementos
                + ", restriccion=" + restriccion + "]";
    }
}
