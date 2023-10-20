package TP02.Gastos;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args){
        //Creo los arreglos
       ArrayList<Double> impuestos1 = new ArrayList<>(5);
       ArrayList<Double> impuestos2 = new ArrayList<>(5);
       ArrayList<Double> impuestos3 = new ArrayList<>(5);
       ArrayList<Double> impuestos4 = new ArrayList<>(5);
       ArrayList<Double> impuestos5 = new ArrayList<>(5);
       ArrayList<Double> impuestos6 = new ArrayList<>(5);
       ArrayList<Ciudad> ciudades1 = new ArrayList<>();
       ArrayList<Ciudad> ciudades2 = new ArrayList<>();
       ArrayList<Provincia> provincias = new ArrayList<>();
      
       //Añado impuestos
       impuestos1.add(222000.0);
       impuestos1.add(3000.0);
       impuestos1.add(4200.0);
       impuestos1.add(5120.0);
       impuestos1.add(1000.0);

       impuestos2.add(2000.0);
       impuestos2.add(3000.0);
       impuestos2.add(4200.0);
       impuestos2.add(5120.0);
       impuestos2.add(1000.0);

       impuestos3.add(4000.0);
       impuestos3.add(3000.0);
       impuestos3.add(4200.0);
       impuestos3.add(71120.0);
       impuestos3.add(1000.0);

       impuestos4.add(222000.0);
       impuestos4.add(3000.0);
       impuestos4.add(4200.0);
       impuestos4.add(5120.0);
       impuestos4.add(1000.0);

       impuestos5.add(2000.0);
       impuestos5.add(3000.0);
       impuestos5.add(4200.0);
       impuestos5.add(5120.0);
       impuestos5.add(1000.0);

       impuestos6.add(4000.0);
       impuestos6.add(3000.0);
       impuestos6.add(4200.0);
       impuestos6.add(71120.0);
       impuestos6.add(1000.0);

       //Creo las ciudades
       Ciudad ciudad1 = new Ciudad("Rauch", impuestos1, 100000);
       Ciudad ciudad2 = new Ciudad("Tandil", impuestos2, 90000);
       Ciudad ciudad3 = new Ciudad("Balcarce", impuestos3, 100000);
       Ciudad ciudad4 = new Ciudad("Villa Carlos Paz", impuestos4, 100000);
       Ciudad ciudad5 = new Ciudad("Cordoba", impuestos5, 90000);
       Ciudad ciudad6 = new Ciudad("Cosquin", impuestos6, 100000);
       //Añado ciudades
       ciudades1.add(ciudad1);
       ciudades1.add(ciudad2);
       ciudades1.add(ciudad3);

       ciudades2.add(ciudad4);
       ciudades2.add(ciudad5);
       ciudades2.add(ciudad6);
       
       ciudades1.addAll(ciudades2);
       //Creo las provincias
       Provincia provincia1 = new Provincia("Buenos Aires", ciudades1);
       Provincia provincia2 = new Provincia("Cordoba", ciudades2);
       //Añado provincias
       provincias.add(provincia1);
       provincias.add(provincia2);
       //Creo paises
       Pais pais = new Pais("Argentina", ciudades1, provincias);

       //Invoco los metodos
        pais.ciudadesConDeficit();
        pais.provinciasConDeficit();
    }
}
