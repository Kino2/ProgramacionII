package ArbolBinario;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.add(5);
        arbol.add(10);
        arbol.add(15);
        arbol.add(3);
        arbol.add(7);

        ImprimirEnPantalla imprimir = new ImprimirEnPantalla();
        arbol.recorridoEnOrden(imprimir);
    }
}
