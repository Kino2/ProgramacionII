package TP05.Hogwarts;

import java.util.ArrayList;


public class Casa {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> alumnosAsignados;
    private String casaEnemiga;
    private int capacidad;

    public Casa(String nombre, ArrayList<String> cualidades, int capacidad, String casaEnemiga) {
        setNombre(nombre);
        this.cualidades = cualidades;
        this.casaEnemiga = casaEnemiga;
        this.alumnosAsignados = new ArrayList<>();
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarAlumno(Alumno alumno) {
        if ((alumnosAsignados.size() < capacidad) && cumpleRequisitos(cualidades) && !tieneEnemistad(alumno.getCasa())) {
            alumnosAsignados.add(alumno);
            System.out.println("Alumno asignado con exito!");
        } else {
            System.out.println("El alumno no cumple con los requisitos y no se asignará a la lista de alumnos");
        }
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Gryffindor") || nombre.equals("Slytherin") || nombre.equals("Hufflepuff")
                || nombre.equals("Ravenclaw")) {
            this.nombre = nombre;
        } else {
            System.out.println("No existe esta casa en Hogwarts");
        }
    }

    public boolean familiaresAsignados(Alumno alumno){
        for(int i = 0; i <alumno.getFamiliares().size(); i++){
            if(alumnosAsignados.contains(alumno.getFamiliares().get(i))){
                return true;
            }
        }
        return false;
    }
    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public boolean cumpleRequisitos(ArrayList<String> cualidades) {
        if (nombre.equals("Gryffindor") && cualidades.contains("Audacia") && cualidades.contains("Fuerza")) {
            return true;
        } else if (nombre.equals("Slytherin") && cualidades.contains("Ambicion") && cualidades.contains("Determinacion")
                && cualidades.contains("Astucia")) {
            return true;
        } else if (nombre.equals("Hufflepuff") && cualidades.contains("Justicia") && cualidades.contains("Lealtad")
                && cualidades.contains("Paciencia")) {
            return true;
        } else if (nombre.equals("Ravenclaw") && cualidades.contains("Creatividad") && cualidades.contains("Erudicion")
                && cualidades.contains("Inteligencia")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneEnemistad(Casa casa) {
        return this.casaEnemiga.contains(casa.getNombre());
    }

}
