package SistemaElectoral;

public abstract class ElementoDistrito {
    public abstract int recuentoVotosCandidato(Candidato candidato);
    public abstract int recuentoVotosEnBlanco();
    public abstract int recuentoVotosEnDetHora();
    public abstract int getVotos();
}
