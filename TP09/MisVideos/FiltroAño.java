package MisVideos;

public class FiltroAño extends Filtro{
    private int anio;

    public FiltroAño(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getAnio() == anio;
    }
    
}
