package abstracto2;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoCola> elementos;

    public ColaEspera() {
        elementos = new ArrayList<>();
    }

    public ElementoCola getSiguiente() {
        if (this.tieneElementos()) {
            return elementos.remove(0);
        } else {
            return null;
        }
    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    public void addElemento(ElementoCola elemento) {
        boolean inserto = false;
        int i = 0;
        while (!inserto && i < elementos.size()) {
            if (elemento.esMayor(elementos.get(i))) {
                elementos.add(i, elemento);
                inserto = true;
            }
            i++;
        }
        if (!inserto) {
            elementos.add(elemento);
        }
    }

    public ArrayList<ElementoCola> getElementos() {
        return elementos;
    }
    
}
