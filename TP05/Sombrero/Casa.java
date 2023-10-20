package TP05.Sombrero;

import java.util.ArrayList;

public class Casa {
    protected String nombre;
    protected ArrayList<String> cualidades = new ArrayList<>();;
    protected ArrayList<Alumno> alumnos = new ArrayList<>();
    protected int capacidad;

    public Casa(String nombre) {
        setNombre(nombre);
        setCualidades(cualidades);
        capacidad = setCapacidad(capacidad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Gryffindor") || nombre.equals("Slytherin") || nombre.equals("RavenClaw")
                || nombre.equals("Hufflepuff")) {
            this.nombre = nombre;
        } else {
            System.out.println("No existe la casa" + nombre);
        }
    }

    public int setCapacidad(int capacidad) {
        if (nombre.equals("Gryffindor")) {
            capacidad = 400;
        } else if (nombre.equals("Slytherin")) {
            capacidad = 380;
        } else if (nombre.equals("RavenClaw")) {
            capacidad = 200;
        } else if (nombre.equals("Hufflepuff")) {
            capacidad = 180;
        }
        return capacidad;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        if (nombre.equals("Gryffindor")) {
            cualidades.add("Audacia");
            cualidades.add("Fuerza");
        } else if (nombre.equals("Slytherin")) {
            cualidades.add("Ambicion");
            cualidades.add("Determinacion");
            cualidades.add("Astucia");
        } else if (nombre.equals("Hufflepuff")) {
            cualidades.add("Justicia");
            cualidades.add("Paciencia");
            cualidades.add("Lealtad");
        } else if (nombre.equals("RavenClaw")) {
            cualidades.add("Creatividad");
            cualidades.add("Inteligencia");
            cualidades.add("Erudicion");
        }
    }



    public boolean cumpleRequisitos(Alumno alumno) {
        ArrayList<String> requisitos = alumno.getCualidades();
        if (capacidad > alumnos.size()) {
            for (int i = 0; i < cualidades.size(); i++) {
                if (!cualidades.contains(requisitos.get(i))) {
                    return false;
                }
            }
        }
        return true;
}

    public void asignarAlumno(Alumno alumno) {
        if (cumpleRequisitos(alumno)) {
            alumnos.add(alumno);
            System.out.println("Alumno " + alumno.getNombre() + " asignado a la casa " + nombre);
        } else {
            System.out.println("No se ha podido asignar el alumno");
        }
    }
}
