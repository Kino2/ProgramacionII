package Documentos;

public class CondicionXTituloConPalabra extends Condicion{
    private String titulo;

    public CondicionXTituloConPalabra(String titulo) {
        this.titulo = titulo.toLowerCase();
    }
    
    public boolean cumple(Documento documento){
        return documento.getTitulo().toLowerCase().contains(titulo);
    }
}
