package Parcial2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> materiales = new ArrayList<>();
        ArrayList<String> materiales2 = new ArrayList<>();

        materiales.add("madera");
        materiales.add("plastico");
        materiales.add("piedra");
        materiales.add("metal");
        
        materiales2.add("diamante");
        materiales2.add("oro");
        materiales2.add("platino");
        materiales2.add("madera");
        materiales2.add("madera");

        Tarea tarea1 = new Tarea("Tarea 1", materiales, 100.0, 2, 3);
        Tarea tarea2 = new Tarea("Tarea 2", materiales, 150.0, 3, 4);
        Tarea tarea3 = new Tarea("Tarea 3", materiales2, 80.0, 1, 2);

        PresupuestoUrgente presupuestoUrgente = new PresupuestoUrgente("Hola");
        presupuestoUrgente.addComponente(tarea1);
        presupuestoUrgente.addComponente(tarea2);
        presupuestoUrgente.addComponente(tarea3);

        Filtro f = new FiltroMasDias(3);
        PresupuestoUrgente.setAumentoCosto(1);
        System.out.println(presupuestoUrgente.getCosto());

        
    }
}
