package Documentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> autores = new ArrayList<>();
        ArrayList<String> autores2 = new ArrayList<>();

        ArrayList<String> palabras = new ArrayList<>();
        ArrayList<String> palabras2 = new ArrayList<>();

        autores.add("Esteban");
        autores.add("Sergio");
        autores.add("karina");
        palabras.add("gol");
        palabras.add("golazo");

        autores2.add("Enzo");
        autores2.add("dario");
        palabras2.add("falta");
        palabras2.add("CORNER");

        String contenido = "hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi ";
        Documento doc = new Documento("futbol", autores, "hola", palabras);
        Documento doc2 = new Documento("futbol", autores2, contenido, palabras2);
        Digitalizador dig = new Digitalizador();
        Condicion c1 = new CondicionXTitulo("Futbol");
        Condicion c2 = new CondicionXAutor("enzo");
        Condicion c3 = new CondicionCombinada(c1, c2);

        dig.addDocumento(doc);
        dig.addDocumento(doc2);

        System.out.println(dig.busquedaXCondicion(c3));
    }
}
