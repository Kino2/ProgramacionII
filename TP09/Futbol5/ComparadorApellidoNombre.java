package Futbol5;

import java.util.Comparator;

public class ComparadorApellidoNombre implements Comparator<Socio> {
    private ComparadorApellido compApe;
    private ComparadorNombre compNom;
    
    public ComparadorApellidoNombre() {
        compApe = new ComparadorApellido();
        compNom = new ComparadorNombre();
    }

    public int compare(Socio socio1, Socio socio2){
        int aux = compApe.compare(socio1, socio2);
        if(aux == 0){
            return compNom.compare(socio1, socio2);
        } else {
            return aux;
        }
    }
    
}
