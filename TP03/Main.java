package TP03;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args){
        ArrayList<Pregunta>preguntas = new ArrayList<>();
        ArrayList<Pregunta>preguntas2 = new ArrayList<>();
   
        Pregunta pregunta1 = new Pregunta("¿Tu color favorito?");
        Pregunta pregunta2 = new Pregunta("¿Tu idolo de chico?");
        Pregunta pregunta3 = new Pregunta("¿Traba lindo o mina fea?");

        preguntas.add(pregunta1);
        preguntas.add(pregunta2);
        preguntas.add(pregunta3);

        preguntas2.add(pregunta3);
        preguntas2.add(pregunta2);
        preguntas2.add(pregunta1);

        Persona persona = new Persona("Esteban", 44357083);
        Empleado empleado = new Empleado("Sergio", 2);
        Encuesta encuesta = new Encuesta(preguntas, persona, empleado);
        Encuesta encuesta2 = new Encuesta(preguntas, persona, empleado);
        Compañia compañia = new Compañia(encuesta, empleado, persona, 0);
        Compañia compañia2 = new Compañia(encuesta2, empleado, persona, 0);
        compañia.informatizarEncuesta();
        compañia2.informatizarEncuesta();
    }
}
