package ArbolBinario;

public class Contador implements AccionEjecutable {
    private int contador;

    public Contador() {
        contador = 0;
    }

    public void ejecutarNodo(Object nodo){
        if(nodo != null){
            contador++;
        }
    }

    public int getContador() {
        return contador;
    }
    
}
