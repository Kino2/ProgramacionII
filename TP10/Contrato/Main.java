package Contrato;

public class Main {
    public static void main(String[] args) {
        CriterioAceptacion criterio = new CriterioPorHoras(9);
        CriterioAceptacion criterio2 = new CriterioEmpresa();
        CriterioAceptacion criterio4 = new CriterioSueldo();

        Candidato c = new Candidato("Esteban", "La serenisima", 50000, criterio4, false);
        Candidato c2 = new Candidato("Karina", "Ubisoft", 20000, criterio2, false);
        Candidato c3 = new Candidato("Sergio", "Cablevision", 400000, criterio, false);
        Candidato c4 = new Candidato("Esteban", "La serenisima", 50000, criterio4, false);

        OfertaLaboral oferta = new OfertaLaboral(8, "Fibertel", 60000);
        Consultora consultora = new Consultora(oferta);

        consultora.addCandidato(c3);
        consultora.addCandidato(c);
        consultora.addCandidato(c2);
        consultora.addCandidato(c4);

        System.out.println(consultora.aceptanOferta());
    }
}
