package Noticias;

import java.util.ArrayList;

public class Categoria extends ElementoC {
    private String nombre;
    private ArrayList<ElementoC> elementos;
    private ArrayList<Noticia> noticias;

    public Categoria(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<>();
        noticias = new ArrayList<>();
    }

    public ArrayList<String> dibujarmapa() {
        ArrayList<String> mapa = new ArrayList<>();
        String concatenacion = " " + this.getNombre();
        for (int i = 0; i < elementos.size(); i++) {
            ArrayList<String> subMapa = elementos.get(i).dibujarmapa();
            String subMapaString = subMapa.toString().replace("[", "").replace("]", "");
            concatenacion += " \\" + subMapaString + "\n";
            mapa.add(concatenacion);
        }
        return mapa;
    }

    public ArrayList<ElementoC> busqueda(Filtro f) {
        ArrayList<ElementoC> elem = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoC elemHijo = elementos.get(i);
            elem.addAll(elemHijo.busqueda(f));
        }

        return elem;
    }

    public void addElemento(ElementoC e) {
        this.elementos.add(e);
        e.setPadre(this);
    }

    public int cantNoticias() {
        int cantNoticias = getCantNoticias();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoC elemHijo = elementos.get(i);
            cantNoticias += elemHijo.cantNoticias();
        }
        return cantNoticias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPath() {
        if (this.getPadre() != null)
            return this.getPadre().getPath() + "\\" + this.getNombre();
        else
            return this.getNombre();
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public int getCantNoticias() {
        int cantNoticias = noticias.size();
        return cantNoticias;
    }

    public ArrayList<ElementoC> getelementos() {
        return elementos;
    }

    public String toString() {
        String path = this.getNombre();
        for (ElementoC e : this.elementos) {
            path += this.getNombre() + "/" + e.toString() + "/n";
        }
        return path;
    }
}
