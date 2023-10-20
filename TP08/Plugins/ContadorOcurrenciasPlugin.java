package Plugins;

import java.util.ArrayList;
import java.util.Arrays;

public class ContadorOcurrenciasPlugin implements Plugin {
    private String palabraABuscar;
    private int CantPalabras;

    public ContadorOcurrenciasPlugin(String palabraABuscar) {
        this.palabraABuscar = palabraABuscar.toLowerCase();
        CantPalabras = 0;
    }

    public void ejecutar(String texto) {
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(texto.split("\\s+")));
        for (int i = 0; i < palabras.size(); i++) {
            if (palabraABuscar.equals(palabras.get(i))) {
                CantPalabras++;
            }
        }
        System.out.println("La palabra está " + CantPalabras + " veces");
    }
}
