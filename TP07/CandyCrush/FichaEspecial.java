package CandyCrush;

public class FichaEspecial extends Ficha {
    public FichaEspecial(String tipo, int fortaleza, int espacio) {
        super(tipo, fortaleza, espacio, fortaleza / espacio);
    }
}