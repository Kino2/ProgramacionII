package Futbol5;

public class FiltroMenorDeEdad extends Filtro {
    public boolean cumple (Socio socio){
        return socio.getEdad() < 18;
    }
}
