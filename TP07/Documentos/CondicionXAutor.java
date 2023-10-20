package Documentos;

import java.util.ArrayList;

public class CondicionXAutor extends Condicion {
    private String autor;

    public CondicionXAutor(String autor) {
        this.autor = autor.toLowerCase();
    }
    
    public boolean cumple(Documento documento){
        ArrayList<String> autores = documento.getAutores();
        return autores.contains(autor);
    }
}
