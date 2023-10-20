package SistemaElectoral;

import java.util.ArrayList;

public class Listado {
    private ArrayList<Candidato> candidatos;

    public Listado(){
        candidatos = new ArrayList<>();
    }

    public void addCandidato(Candidato c){
        if(!candidatos.contains(c)){
            candidatos.add(c);
        }
    }

    public ArrayList<Candidato> getCandidatos() {
        Comparador comparador = new Comparador();
        candidatos.sort(comparador);
        return candidatos;
    }
}
