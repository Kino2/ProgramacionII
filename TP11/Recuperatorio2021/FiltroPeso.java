package TP11.Recuperatorio2021;

public class FiltroPeso extends Filtro {
    private double peso;

    public FiltroPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ElementoBazar elemento) {
        return elemento.getPeso() > peso;
    }

}
