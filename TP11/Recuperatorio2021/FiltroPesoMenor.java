package TP11.Recuperatorio2021;

public class FiltroPesoMenor extends Filtro {
    private double peso;

    public FiltroPesoMenor(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ElementoBazar elemento) {
        return elemento.getPeso() < peso;
    }

}
