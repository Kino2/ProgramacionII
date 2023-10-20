package TP02;

import java.util.ArrayList;
public class Principal {
    public static void main (String [] args){
        // Crear  episodios
        Episodio episodio1 = new Episodio("Episodio 1", "Holis");
        Episodio episodio2 = new Episodio("Episodio 2", "Descripcion");
        Episodio episodio3 = new Episodio("Episodio 3", "Holis");
        Episodio episodio4 = new Episodio("Episodio 4", "Descripcion");
        Episodio episodio5 = new Episodio("Episodio 5", "Holis");
        Episodio episodio6 = new Episodio("Episodio 6", "Descripcion");

        // Agregar episodios a una temporada
        ArrayList<Episodio> episodiosTemporada1 = new ArrayList <> ();
        episodiosTemporada1.add(episodio1);
        episodiosTemporada1.add(episodio2);
        ArrayList<Episodio> episodiosTemporada2 = new ArrayList <> ();
        episodiosTemporada2.add(episodio3);
        episodiosTemporada2.add(episodio4);
        episodiosTemporada2.add(episodio5);
        episodiosTemporada2.add(episodio6);

        Temporada temporada1 = new Temporada (2, episodiosTemporada1);
        Temporada temporada2 = new Temporada (4, episodiosTemporada2);

        // Crear una serie y agregar temporadas
        ArrayList<Temporada> temporadasSerie = new ArrayList<>();
        temporadasSerie.add(temporada1);
        temporadasSerie.add(temporada2);

        Serie serie = new Serie("Mi Serie", "Descripción de la serie", "Creador", "Género", temporadasSerie);

        // Asignar calificaciones
        episodio1.ingresarCalificacion(5);
        episodio2.ingresarCalificacion(3);
        episodio3.ingresarCalificacion(2);
        episodio4.ingresarCalificacion(1);
        episodio5.ingresarCalificacion(4);
        episodio6.ingresarCalificacion(5);

        // Calcular y mostrar resultados
        System.out.println("Promedio de calificaciones de la serie " + serie.getPromedio());
        System.out.println("¿Se vieron todos los episodios de la temporada 2? " + temporada2.vioLaTemporadaCompleta());
        System.out.println("¿Se vieron todos los episodios de la serie? " + serie.vioTodaLaSerie());
        System.out.println("El total de episodios vistos en la temporada 2 es de " +temporada2.getEpisodiosVistos() + " episodios");
    }   
}
