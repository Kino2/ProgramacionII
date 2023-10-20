package MisVideos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayListSponsoreada extends PlayList {
    private Video sponsoreado;

    public PlayListSponsoreada(String titulo, int segundosDemora, Video sponsoreado) {
        super(titulo, segundosDemora);
        this.sponsoreado = sponsoreado;
    }

    @Override
    public ArrayList<Video> busqueda(Filtro f, Comparator<Video> orden) {
        ArrayList<Video> videos = new ArrayList<>();
        videos.add(sponsoreado); // Agregar el video sponsoreado al principio
        for (int i = 0; i < elementosM.size(); i++) {
            ElementoM e = elementosM.get(i);
            videos.addAll(e.busqueda(f, orden));
        }
        Collections.sort(videos, orden);
        return videos;
    }

    public Video getSponsoreado() {
        return sponsoreado;
    }

    public ArrayList<ElementoM> getElementosM() {
        return elementosM;
    }

    
}
