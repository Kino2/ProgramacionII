package MisVideos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*ElementosM contiene tanto playlists y videos */
public class PlayList extends ElementoM {
    private String titulo;
    protected ArrayList<ElementoM> elementosM;

    public PlayList(String titulo, int segundosDemora) {
        super(segundosDemora);
        this.titulo = titulo;
        elementosM = new ArrayList<>();
    }

    public void addElemento(ElementoM e) {
        elementosM.add(e);
    }

    @Override
    public ArrayList<Video> busqueda(Filtro f, Comparator<Video> orden) {
        ArrayList<Video> videos = new ArrayList<>();
        for (int i = 0; i < elementosM.size(); i++) {
            ElementoM e = elementosM.get(i);
            videos.addAll(e.busqueda(f, orden));
        }
        Collections.sort(videos, orden);
        return videos;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> palabrasClavesUnicas = new ArrayList<>();

        for (int i = 0; i < elementosM.size(); i++) {
            ElementoM e = elementosM.get(i);
            ArrayList<String> palabrasClaves = e.getPalabrasClaves();
            for (int j = 0; j < palabrasClaves.size(); j++) {
                String palabra = palabrasClaves.get(j);
                if (!palabrasClavesUnicas.contains(palabra)) {
                    palabrasClavesUnicas.add(palabra);
                }
            }
        }
        return palabrasClavesUnicas;
    }

    @Override
    public int cantVideos() {
        int cantVideos = 0;
        for (int i = 0; i < elementosM.size(); i++) {
            ElementoM e = elementosM.get(i);
            cantVideos += e.cantVideos();
        }
        return cantVideos;
    }

    @Override
    public int getDuracion() {
        int duracion = 0;
        for (int i = 0; i < elementosM.size(); i++) {
            ElementoM e = elementosM.get(i);
            duracion += e.getDuracion();
        }
        return duracion + getSegundosDemora();
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<ElementoM> getElementosM() {
        return elementosM;
    }

}
