package Contrato;

import java.util.ArrayList;

public class Consultora {
    private ArrayList<Candidato> candidatos;
    private OfertaLaboral oferta;

    public Consultora(OfertaLaboral oferta) {
        candidatos = new ArrayList<>();
        this.oferta = oferta;
    }

    public void addCandidato(Candidato c) {
        if (!candidatos.contains(c)) {
            candidatos.add(c);
        } else {
            System.out.println("No se puede agregar a " + c.getNombre());
        }
    }

    public ArrayList<Candidato> aceptanOferta() {
        ArrayList<Candidato> candidatosAceptados = new ArrayList<>();
        for (int i = 0; i < candidatos.size(); i++) {
            Candidato c = candidatos.get(i);
            if (c.cumpleCriterio(oferta)) {
                candidatosAceptados.add(c);
            }
        }
        return candidatosAceptados;
    }
}
