package Plugins;

import java.util.ArrayList;
import java.util.Arrays;

public class ContadorPalabrasPlugin implements Plugin {
    private int cantPalabras;

    public void ejecutar(String texto){
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(texto.split("\\s+")));
        cantPalabras = palabras.size();
        System.out.println(cantPalabras);
    }

    public int getCantPalabras() {
        return cantPalabras;
    }
    
}
