package Documentos;

public class CondicionCombinada extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionCombinada(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Documento documento) {
        return c1.cumple(documento) && c2.cumple(documento);
    }
}
