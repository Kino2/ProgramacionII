package Contrato;

public class CriterioPorHoras extends CriterioAceptacion {
    private int horas;

    public CriterioPorHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public boolean cumpleCriterio(OfertaLaboral o, Candidato c) {
        return o.getHorasOfrecidas() <= horas;
    }

}
