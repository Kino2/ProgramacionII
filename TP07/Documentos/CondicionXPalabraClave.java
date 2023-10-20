package Documentos;

import java.util.ArrayList;

public class CondicionXPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionXPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    public boolean cumple(Documento documento) {
        ArrayList<String> palabrasClaves = documento.getPalabrasClave();
        return palabrasClaves.contains(palabraClave);
    }
}
