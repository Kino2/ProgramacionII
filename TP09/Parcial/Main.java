package Parcial;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         ArrayList<String> palabrasClaves1 = new ArrayList<>();
        palabrasClaves1.add("tecnología");
        palabrasClaves1.add("innovación");
        palabrasClaves1.add("gadgets");

        ArrayList<String> palabrasClaves2 = new ArrayList<>();
        palabrasClaves2.add("deportes");
        palabrasClaves2.add("fútbol");
        palabrasClaves2.add("Liga");

        ArrayList<String> palabrasClaves3 = new ArrayList<>();
        palabrasClaves3.add("cultura");
        palabrasClaves3.add("arte");
        palabrasClaves3.add("música");
         palabrasClaves3.add("música");

        Noticia noticia1 = new Noticia("Nueva tecnología revoluciona la industria de los gadgets.", "Avances tecnológicos", "Juan Perez", "Tecnología", palabrasClaves1);
        Noticia noticia2 = new Noticia("El equipo local ganó el partido de fútbol por 3-1.", "Victoria en el estadio", "Maria Lopez", "Deportes", palabrasClaves2);
        Noticia noticia3 = new Noticia("Gran concierto de música clásica en el teatro principal.", "Concierto de música", "Juan Perez", "Cultura", palabrasClaves3);
    
        Categoria categoria = new Categoria("Deportes");
        Categoria categoria2 = new Categoria("Espectaculos");
        Categoria categoria3 = new Categoria("Policial");
        categoria.addElemento(noticia1);
        categoria.addElemento(categoria2);
        categoria2.addElemento(categoria3);
        categoria2.addElemento(noticia2);
        categoria3.addElemento(noticia3);

        Filtro f = new FiltroAutor("juan perez");
        System.out.println(categoria.getPalabrasClaves());
    }
}
