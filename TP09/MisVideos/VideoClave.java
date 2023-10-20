package MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public class VideoClave extends Video {

    public VideoClave(String titulo, Usuario usuario, int duracion, int visualizaciones, int likes, int dislikes,
            ArrayList<String> palabrasClaves) {
        super(titulo, usuario, duracion, visualizaciones, likes, dislikes, palabrasClaves);
    }

    @Override
    public ArrayList<Video> busqueda(Filtro f, Comparator<Video> orden) {
        ArrayList<Video> video = new ArrayList<>();
        video.add(this);
        return video;
    }

}
