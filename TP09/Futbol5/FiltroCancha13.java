package Futbol5;


public class FiltroCancha13 extends Filtro {
    public boolean cumple(Socio socio) {
        int contador = socio.cantAlquilerC13();
        return contador > 0;
    }
}
