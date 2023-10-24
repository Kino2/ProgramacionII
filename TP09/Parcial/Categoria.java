package Parcial;

import java.util.ArrayList;

public class Categoria extends ElementoNoticia {
    private String nombre;
    private ArrayList<ElementoNoticia> elementos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoNoticia e) {
        if (!elementos.contains(e)) {
            elementos.add(e);
        }
    }

    @Override
    public void agregarPalabraSegunFiltro(Filtro f, String palabra) {
        for (ElementoNoticia e : elementos) {
            e.agregarPalabraSegunFiltro(f, palabra);
        }
    }

    public void recorrido(){
        for(ElementoNoticia e : elementos){
            System.out.println(e);
        }
    }
    @Override
    public ArrayList<Noticia> busqueda(Filtro f) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for (ElementoNoticia e : elementos) {
            resultado.addAll(e.busqueda(f));
        }
        return resultado;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> palabrasClavesUnicas = new ArrayList<>();
        for (ElementoNoticia e: elementos) {
            ArrayList<String> palabrasClaves = e.getPalabrasClaves();
            for (String s : palabrasClaves) {
                if (!palabrasClavesUnicas.contains(s)) {
                    palabrasClavesUnicas.add(s);
                }
            }
        }
        return palabrasClavesUnicas;
    }

    public String getNombre() {
        return nombre;
    }

}
