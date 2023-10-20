package ArbolBinario;

public class NodoDelArbolImpl implements NodoDelArbol {
    private int valor;
    private NodoDelArbol izquierda;
    private NodoDelArbol derecha;

    public NodoDelArbolImpl(int valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public NodoDelArbol getIzquierda() {
        return izquierda;
    }

    @Override
    public NodoDelArbol getDerecha() {
        return derecha;
    }

    @Override
    public void setIzquierda(NodoDelArbol izquierda) {
        this.izquierda = izquierda;
    }

    @Override
    public void setDerecha(NodoDelArbol derecha) {
        this.derecha = derecha;
    }
}
