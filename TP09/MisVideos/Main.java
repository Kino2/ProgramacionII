package MisVideos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayList playlist = new PlayList("Pop", 5);
        PlayList playlist2 = new PlayList("Rock", 10);
        PlayList playlist3 = new PlayList("Cumbia", 15);
        

        Usuario usuario = new Usuario("Asteban", 2002, "hola@gmail.com");
        Usuario usuario2 = new Usuario("Esteban", 2002, "hola@gmail.com");
        ArrayList<String> palabrasClaves1 = new ArrayList<>();
        palabrasClaves1.add("java");
        palabrasClaves1.add("programming");

        ArrayList<String> palabrasClaves2 = new ArrayList<>();
        palabrasClaves2.add("gardening");
        palabrasClaves2.add("plants");;

        Video video1 = new Video("Video 1", usuario, 120, 1000, 50, 5, palabrasClaves1);
        Video video2 = new Video("Video 2", usuario2, 180, 1500, 70, 10, palabrasClaves2);
        VideoClave video4 = new VideoClave("Video 4", usuario2, 180, 1500, 70, 10, palabrasClaves1);
        Video videoEspecial = new Video("Video 3", usuario2, 180, 1500, 70, 10, palabrasClaves2);
        PlayListSponsoreada playlist4 = new PlayListSponsoreada("Reggaeton", 20, videoEspecial);
        playlist4.addElemento(playlist2);
        playlist4.addElemento(video2);
        playlist2.addElemento(playlist3);
        playlist3.addElemento(video2);
        playlist3.addElemento(playlist);
        playlist4.addElemento(video1);
        playlist3.addElemento(video4);

        FiltroPalabraClave filtro = new FiltroPalabraClave("gardening");
        Comparador orden = new Comparador();
        System.out.println(playlist4.busqueda(filtro, orden));

    }
}
