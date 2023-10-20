package Documentos;

public class CondicionXContenidoClave extends Condicion {
    private String palabraOFrase;

    public CondicionXContenidoClave(String palabraOFrase) {
        this.palabraOFrase = palabraOFrase.toLowerCase();
    }
    
    public boolean cumple(Documento documento){
        return documento.getContenidoTextual().contains(palabraOFrase);
    }
}
