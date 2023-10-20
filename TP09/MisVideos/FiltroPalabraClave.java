package MisVideos;

import java.util.ArrayList;

public class FiltroPalabraClave extends Filtro{
    private String palabra;

    public FiltroPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Video v) {
        ArrayList<String> palabrasClaves = v.getPalabrasClaves();
        return palabrasClaves.contains(palabra);
    }
    
    
}
