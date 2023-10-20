package abstracto3;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoCola> elementos;

    public ColaEspera(){
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoCola elemento){
        int i = 0;
        boolean inserto = false;
        while(!inserto && i < elementos.size()){
            if(elemento.esMayor(elementos.get(i))){
                elementos.add(i, elemento);
                inserto = true;
            }
            i++;
        }
        if(!inserto){
            elementos.add(elemento);
        }
    }

    public ElementoCola getSiguiente(){
        if(tieneElementos()){
            return elementos.remove(0);
        } else {
            return null;
        }
    }
    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }
}
