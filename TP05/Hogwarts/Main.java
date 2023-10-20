package TP05.Hogwarts;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String [] args){
        ArrayList<String> cualidadesSlytherin = new ArrayList<>(Arrays.asList("Ambicion", "Determinacion", "Astucia"));
        ArrayList<Alumno> familiares = new ArrayList<>();
        
        Casa casa = new Casa("Slytherin", cualidadesSlytherin, 2, "Gryffindor");
        Casa casa2 = new Casa("Hufflepuff", cualidadesSlytherin, 2, "Slytherin");

        Alumno alumno = new Alumno("Esteban", cualidadesSlytherin, cualidadesSlytherin,casa);
        Alumno alumno2 = new Alumno("Santiago", cualidadesSlytherin, cualidadesSlytherin, casa);

        familiares.add(alumno);
        casa.asignarAlumno(alumno);
    }
}
