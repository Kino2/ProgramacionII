package TP05.Sombrero;

import java.util.ArrayList;

public class Escuela {
    public static void main (String [] args){
        ArrayList<String> cualidades = new ArrayList<>();
        cualidades.add("Audacia");
        cualidades.add("Fuerza");
        ArrayList<Alumno> familiares = new ArrayList<>();

        Alumno alumno = new Alumno("Esteban", cualidades, null);
        Casa casa = new CasaExigente("Gryffindor");
        casa.asignarAlumno(alumno);
        System.out.println(casa.cumpleRequisitos(alumno));
    }
}
