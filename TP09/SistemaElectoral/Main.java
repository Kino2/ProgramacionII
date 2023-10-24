package SistemaElectoral;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Lugar localidad = new Lugar("Rauch");
        Lugar barrio = new Lugar("Belgrano");
        Lugar barrio2 = new Lugar("31");
        Lugar establecimiento = new Lugar("ISR");

        localidad.addDistrito(barrio);
        localidad.addDistrito(barrio2);
        barrio.addDistrito(establecimiento);

        Candidato candidato1 = new Candidato("Esteban", "Frente para la victoria", "Derecha");
        Candidato candidato2 = new Candidato("Ana", "Frente para la victoria", "Derecha");
        Candidato candidato3 = new Candidato("Ariel", "Frente para la victoria", "Derecha");

        Listado listado = new Listado();
        listado.addCandidato(candidato3);
        listado.addCandidato(candidato2);
        listado.addCandidato(candidato1);

        Votante votante1 = new Votante("Sergio", 441234);
        Votante votante2 = new Votante("Karina", 231231);
        Votante votante3 = new Votante("Pipo", 123124);
        Votante votante4 = new Votante("Pipa", 1231242);
        Votante votante5 = new Votante("ea", 2131414);

        LocalTime hora1 = LocalTime.of(10, 1);
        LocalTime hora2 = LocalTime.of(10, 40);
        LocalTime hora3 = LocalTime.of(12, 0);

        Voto voto1 = new Voto(candidato2, votante3, hora1);
        Voto voto2 = new Voto(candidato3, votante2, hora1);
        Voto voto3 = new Voto(candidato1, votante1, hora2);
        Voto voto4 = new Voto(null, votante5, hora3);

        Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa();
        Mesa mesa3 = new Mesa();

        mesa1.addPersonaAlPadron(votante5);
        mesa1.addPersonaAlPadron(votante2);
        mesa1.addVoto(voto4);
        mesa1.addVoto(voto2);

        mesa2.addPersonaAlPadron(votante1);
        mesa2.addPersonaAlPadron(votante2);
        mesa2.addVoto(voto2);
        mesa2.addVoto(voto2);

        mesa3.addPersonaAlPadron(votante5);
        mesa3.addPersonaAlPadron(votante2);
        mesa3.addVoto(voto4);
        mesa3.addVoto(voto2);

        establecimiento.addDistrito(mesa2);
        establecimiento.addDistrito(mesa1);
        establecimiento.addDistrito(mesa1);
        barrio2.addDistrito(mesa3);

        System.out.println(barrio2.recuentoVotosEnBlanco());
        System.out.println(barrio2.porcentajeVotos());
        System.out.println(listado.getCandidatos());
    }
}
