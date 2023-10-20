package TP05.Sombrero;

public class CasaExigente extends Casa {
    private String casaEnemiga;

    public CasaExigente(String nombre) {
        super(nombre);
        setCasaEnemiga();
    }

    public String getCasaEnemiga() {
        return casaEnemiga;
    }

    public void setCasaEnemiga() {
        if (nombre.equals("Gryffindor")) {
            casaEnemiga = "Slytherin";
        } else if (nombre.equals("Slytherin")) {
            casaEnemiga = "Gryffindor";
        } else {
            System.out.println("No tiene una casa enemiga");
        }
    }

    public boolean tieneCasaEnemiga() {
        if (nombre.equals("Gryffindor") || nombre.equals("Slytherin")) {
            return true;
        }
        return false;
    }

    public boolean cumpleRequisitos(Alumno alumno){
        return super.cumpleRequisitos(alumno);
    }
}
