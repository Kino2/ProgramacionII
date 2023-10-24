package Parcial3;

public class RequerimientoSintoma extends Requerimiento {
    private String sintoma;

    public RequerimientoSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    @Override
    public boolean cumple(Paciente p) {
        return p.getSintomas().contains(sintoma);
    }
    
}
