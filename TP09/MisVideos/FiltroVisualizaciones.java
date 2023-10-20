package MisVideos;

public class FiltroVisualizaciones extends Filtro {
    private int visualizaciones;

    public FiltroVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getVisualizaciones() > visualizaciones;
    }

}
