package Parcial;

public class FiltroFrase extends Filtro {
    private String frase;

    public FiltroFrase(String frase) {
        this.frase = frase.toLowerCase();
    }

    @Override
    public boolean cumple(Noticia n) {
        String texto = n.getTexto().toLowerCase();
        return texto.contains(frase);
    }

}
