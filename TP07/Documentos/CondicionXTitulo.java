package Documentos;

public class CondicionXTitulo extends Condicion{
    private String titulo;
    
    public CondicionXTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Documento documento){
        return documento.getTitulo().equalsIgnoreCase(titulo);
    }
}
