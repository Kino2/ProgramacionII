package Noticias;

import java.util.ArrayList;

public class FiltroPalabraClave extends Filtro {
    private String palabraClave1;
    private String palabraClave2;

    public FiltroPalabraClave(String palabraClave1, String palabraClave2) {
        this.palabraClave1 = palabraClave1.toLowerCase();
        this.palabraClave2 = palabraClave2.toLowerCase();
    }

    @Override
    public boolean cumple(Noticia n) {
        ArrayList<String> palabrasClaves = n.getPalabrasClaves();
        return palabrasClaves.contains(palabraClave1) && palabrasClaves.contains(palabraClave2);
    }

}
