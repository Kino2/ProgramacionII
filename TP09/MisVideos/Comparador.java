package MisVideos;

import java.util.Comparator;

public class Comparador implements Comparator<Video> {
    public int compare(Video v1, Video v2) {
        Usuario usuario1 = v1.getUsuario();
        Usuario usuario2 = v2.getUsuario();
        int comparacion = usuario1.getNombre().compareTo(usuario2.getNombre());
        if (comparacion == 0) {
            return usuario1.getEmail().compareTo(usuario2.getEmail());
        }
        return comparacion;
    }
}
