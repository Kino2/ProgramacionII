package TP11.Recuperatorio2021;

public class FiltroPesoSuperior extends Filtro {
    private double peso;

    public FiltroPesoSuperior(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ElementoBazar elemento) {
        return elemento.getPeso() > peso;
    }

}
