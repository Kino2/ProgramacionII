package SistemaElectoral;

import java.time.LocalTime;



public class Voto {
    private Candidato candidatoVotado = null;
    private Votante votante;
    private LocalTime hora;


   
    public Voto(Candidato candidatoVotado, Votante votante, LocalTime hora) {
        this.candidatoVotado = candidatoVotado;
        this.votante = votante;
        this.hora = hora;
    }

    public Candidato getCandidatoVotado() {
        return candidatoVotado;
    }

    public Votante getVotante() {
        return votante;
    }

    public LocalTime getHoraEmision() {
        return hora;
    }

    
    
}
