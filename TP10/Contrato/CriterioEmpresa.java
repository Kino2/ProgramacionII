package Contrato;

public class CriterioEmpresa extends CriterioAceptacion {

    @Override
    public boolean cumpleCriterio(OfertaLaboral o, Candidato c) {
        return o.getEmpresaOfrecida().equals(c.getEmpresa());
    }
}
