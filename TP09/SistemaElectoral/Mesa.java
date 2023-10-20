package SistemaElectoral;

import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends ElementoDistrito {
    private ArrayList<Votante> padron;
    private ArrayList<Voto> votos;

    public Mesa() {
        this.padron = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    public void addPersonaAlPadron(Votante p) {
        padron.add(p);
    }

    public void addVoto(Voto voto) {
        if (padron.contains(voto.getVotante())) {
            votos.add(voto);
        } else {
            System.out.println("La persona no está en el padron de esta mesa");
        }
    }

    public int recuentoVotosCandidato(Candidato candidato) {
        int contador = 0;
        for (int i = 0; i < votos.size(); i++) {
            Voto voto = votos.get(i);
            if (voto.getCandidatoVotado() != null && voto.getCandidatoVotado().equals(candidato)) {
                contador++;
            }
        }
        return contador;
    }

    public int recuentoVotosEnBlanco() {
        int contador = 0;
        for (int i = 0; i < votos.size(); i++) {
            Voto voto = votos.get(i);
            if (voto.getCandidatoVotado() == null) {
                contador++;
            }
        }
        return contador;
    }

    public int recuentoVotosEnDetHora() {
        int contador = 0;
        LocalTime horaInicio = LocalTime.of(10,0);
        LocalTime horaFin = LocalTime.of(11,0);
        for (int i = 0; i < votos.size(); i++) {
            Voto voto = votos.get(i);
            if (voto.getHoraEmision().isAfter(horaInicio) && voto.getHoraEmision().isBefore(horaFin)) {
                contador++;
            }
        }
        return contador;
    }

    public int getVotos() {
        int cantVotos = votos.size();
        return cantVotos;
    }
}
