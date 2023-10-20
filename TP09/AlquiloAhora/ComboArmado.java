package AlquiloAhora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComboArmado extends Elemento {
    private ArrayList<Elemento> elementos;

    public ComboArmado(int identificacion) {
        super(identificacion);
        elementos = new ArrayList<>();
    }

    public void addElemento(Elemento e) {
        elementos.add(e);
    }

    @Override
    public ArrayList<Inventario> busqueda(Filtro f, Comparator<Inventario> orden) {
        ArrayList<Inventario> aux = new ArrayList<>();
        for(int i = 0; i < elementos.size(); i++){
            Elemento e = elementos.get(i);
            aux.addAll(e.busqueda(f, orden));
        }
        Collections.sort(aux, orden);
        return aux;
    }

    @Override
    public int getAntiguedad() {
        int mayorAntiguedad = -1;
        for (int i = 0; i < elementos.size(); i++) {
            Elemento e = elementos.get(i);
            if(e.getAntiguedad()> mayorAntiguedad){
                mayorAntiguedad = e.getAntiguedad();
            }
        }
        return mayorAntiguedad;
    }

    @Override
    public double getValorTotal() {
        double valor = 0;
        for (int i = 0; i < elementos.size(); i++) {
            Elemento e = elementos.get(i);
            valor += e.getValorTotal();
        }
        return valor;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

}
