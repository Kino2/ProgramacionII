package Parcial;

import java.util.ArrayList;

public abstract class ElementoNoticia {
    public abstract ArrayList<String> getPalabrasClaves();
    public abstract ArrayList<Noticia> busqueda(Filtro f);
    public abstract void agregarPalabraSegunFiltro(Filtro f, String palabra);
}
