package ArbolBinario;

public class ArbolBinario {
    private NodoDelArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void add(int valor) {
        raiz = addRecursivamente(raiz, valor);
    }

    public NodoDelArbol addRecursivamente(NodoDelArbol actual, int valor) {
        if (actual == null) {
            return new NodoDelArbolImpl(valor);
        }
        if (valor < actual.getValor()) {
            actual.setIzquierda(addRecursivamente(actual.getIzquierda(), valor));
        } else if (valor > actual.getValor()) {
            actual.setDerecha(addRecursivamente(actual.getDerecha(), valor));
        }
        return actual;
    }

    public void recorridoEnOrden(AccionEjecutable accion) {
        recorridoEnOrdenRecursivo(raiz, accion);
    }

    private void recorridoEnOrdenRecursivo(NodoDelArbol actual, AccionEjecutable accion) {
        if (actual != null) {
            recorridoEnOrdenRecursivo(actual.getIzquierda(), accion);
            accion.ejecutarNodo(actual.getValor());
            recorridoEnOrdenRecursivo(actual.getDerecha(), accion);
        }
    }

    public void recorridoEnOrdenDescendente(AccionEjecutable accion){
        recorridoEnOrdenDescendenteRecursivo(raiz,accion);
    }

    private void recorridoEnOrdenDescendenteRecursivo(NodoDelArbol actual, AccionEjecutable accion){
        if(actual != null){
            recorridoEnOrdenDescendenteRecursivo(actual.getDerecha(), accion);
            accion.ejecutarNodo(actual.getValor());
            recorridoEnOrdenDescendenteRecursivo(actual.getIzquierda(), accion);
        }
    }
}
