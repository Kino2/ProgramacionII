package ArbolBinario;

public interface NodoDelArbol {
    int getValor();
    NodoDelArbol getIzquierda();
    NodoDelArbol getDerecha();
    void setIzquierda(NodoDelArbol izquierda);
    void setDerecha(NodoDelArbol derecha);
}
