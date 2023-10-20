package Documentos;

import java.util.ArrayList;

public class Digitalizador {
    private ArrayList<Documento> documentos;

    public Digitalizador() {
        documentos = new ArrayList<>();
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    public void addDocumento(Documento documento) {
        if (!documentos.contains(documento)) {
            documentos.add(documento);
        }
    }

    public ArrayList<Documento> busquedaXCondicion(Condicion c) {
        ArrayList<Documento> retorno = new ArrayList<>();
        for (int i = 0; i < documentos.size(); i++) {
            Documento doc = documentos.get(i);
            if(c.cumple(doc)){
                retorno.add(doc);
            }
        }
        return retorno;
    }
}
