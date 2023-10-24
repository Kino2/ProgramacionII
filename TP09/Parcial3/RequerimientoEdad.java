package Parcial3;

public class RequerimientoEdad extends Requerimiento {
    private int edad;

    public RequerimientoEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Paciente p) {
        return p != null && p.getEdad() < edad;
    }
    
}
