package Noticias;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creación de noticias
        ArrayList<String> palabrasClaves1 = new ArrayList<>();
        palabrasClaves1.add("Tecnología");
        palabrasClaves1.add("Innovación");

        Noticia noticia1 = new Noticia("Nueva Era",
                palabrasClaves1, "Una innovadora tecnología promete cambiar el mundo.",
                "Descripción detallada de la nueva tecnología.",
                "Juan Perez", "https://www.ejemplo.com/noticia1");

        ArrayList<String> palabrasClaves2 = new ArrayList<>();
        palabrasClaves2.add("Deportes");
        palabrasClaves2.add("Fútbol");

        Noticia noticia2 = new Noticia("Equipo de Fútbol Gana el Campeonato",
                palabrasClaves2, "El equipo local se lleva el campeonato de fútbol.",
                "Resumen de la victoria del equipo en la final.",
                "Juan Perez", "https://www.ejemplo.com/noticia2");

        Noticia noticia3 = new Noticia("Hola",
                palabrasClaves2, "El equipo local se lleva el campeonato de fútbol.",
                "Resumen de la victoria del equipo en la final.",
                "juan perez", "https://www.ejemplo.com/noticia2");

        Categoria categoria = new Categoria("Generales");
        Categoria seccion = new Categoria("Deportes");
        Categoria subseccion = new Categoria("Futbol");

        categoria.addElemento(seccion);
        seccion.addElemento(subseccion);
        subseccion.addElemento(noticia2);
        seccion.addElemento(noticia1);


        FiltroAutor filtro = new FiltroAutor("Juan Perez");
        System.out.println(noticia2.getPath());
    }
}
