package MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoM {
    private int segundosDemora;
    
    public ElementoM(int segundosDemora) {
        this.segundosDemora = segundosDemora;
    }

    public ElementoM(){    
    }

    public abstract ArrayList<Video> busqueda(Filtro f, Comparator<Video> orden);
    public abstract int cantVideos();
    public abstract int getDuracion();
    public abstract ArrayList<String> getPalabrasClaves();

    public int getSegundosDemora() {
        return segundosDemora;
    }
}
