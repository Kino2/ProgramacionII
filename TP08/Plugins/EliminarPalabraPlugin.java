package Plugins;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminarPalabraPlugin implements Plugin {
    private String palabraEspecifica;

    public EliminarPalabraPlugin(String palabraEspecifica) {
        this.palabraEspecifica = palabraEspecifica.toLowerCase();
    }

    public void ejecutar(String texto){
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(texto.split("\\s+")));
        String textoNuevo = " " ;
        for(int i = 0; i < palabras.size();i++){
            if(!palabraEspecifica.equals(palabras.get(i).toLowerCase())){
                textoNuevo += " " + palabras.get(i);
            }
        }
        System.out.println(textoNuevo);
    }
}
