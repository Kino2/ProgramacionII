package Contrato;

public class CriterioSueldo extends CriterioAceptacion {

    @Override
    public boolean cumpleCriterio(OfertaLaboral o, Candidato c) {
        return o.getSueldoOfrecido() >= c.getSueldo();
    }

}
