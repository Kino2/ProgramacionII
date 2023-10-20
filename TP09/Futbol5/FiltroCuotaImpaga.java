package Futbol5;

public class FiltroCuotaImpaga extends Filtro {
    public boolean cumple(Socio socio){
        return !socio.isPagaUltimaCuota();
    }
}
