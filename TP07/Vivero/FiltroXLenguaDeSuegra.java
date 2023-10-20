package Vivero;

import java.util.ArrayList;

public class FiltroXLenguaDeSuegra extends Filtro{
    private String nombreVulgar;

    public FiltroXLenguaDeSuegra(){
        nombreVulgar = "lengua de suegra";
    }

    public boolean cumple(Planta planta){
        ArrayList<String> nombresVulgares = planta.getNombresVulgares();
        return nombresVulgares.contains(nombreVulgar);
    }

}
