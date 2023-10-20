package CandyCrush;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;
    private double dificultad;

    public Tablero(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
        fichas = new ArrayList<>();
    }

    public void addFicha(Ficha ficha) {
        if (!fichas.contains(ficha)) {
            fichas.add(ficha);
        }
    }

    public void calcularDificultad() {
        double sumaFortaleza = 0;
        double sumaPoder = 0;
        for (int i = 0; i < fichas.size(); i++) {
            sumaFortaleza += fichas.get(i).getFortaleza();
            sumaPoder += fichas.get(i).getPoder();
        }
        this.dificultad = sumaFortaleza/ sumaPoder;
        System.out.println(dificultad);
    }

    public ArrayList<Ficha> realizarBusqueda(Filtro f) {
        ArrayList<Ficha> retorno = new ArrayList<>();
        for (int i = 0; i < fichas.size(); i++) {
            Ficha ficha = fichas.get(i);
            if (f.cumple(ficha)) {
                retorno.add(ficha);
            }
        }
        return retorno;
    }


    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public double getDificultad() {
        return dificultad;
    }

}
