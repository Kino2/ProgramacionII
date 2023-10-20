package Vivero;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>();

    nombres.add("potus");
    nombres.add("pothos");
    nombres.add("potos");
   

    Planta planta = new Planta("Epipremnum aureum", nombres, "Epipremnum", "Araceae", "Monocotyledoneae", "Interior", 3, 4);
    Sistema sistema = new Sistema();
    Filtro filtro = new FiltroXNombreIncluido();
    sistema.addPlanta(planta);
    System.out.println(sistema.filtradoDePlantas(filtro));
  }  
}
