package MisVideos;

public class FiltroUsuario extends Filtro {
    private String autor;
    private int likes;
    private int visualizaciones;
    private FiltroVisualizaciones filtroV;

    public FiltroUsuario(String autor, int likes, int visualizaciones) {
        this.autor = autor.toLowerCase();
        this.likes = likes;
        this.visualizaciones = visualizaciones;
        filtroV = new FiltroVisualizaciones(visualizaciones);
    }

    @Override
    public boolean cumple(Video v) {
        Usuario u = v.getUsuario();
        return u.getNombre().toLowerCase().contains(autor) && v.getLikes() > likes && filtroV.cumple(v);
    }

}
