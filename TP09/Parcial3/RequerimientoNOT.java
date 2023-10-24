package Parcial3;

import java.util.ArrayList;

public class RequerimientoNOT extends Requerimiento {
    private String requerimiento;

    public RequerimientoNOT(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    @Override
    public boolean cumple(Paciente p) {
        ArrayList<String> equipNecesario = p.getEquipamientoNecesario();
        return !equipNecesario.contains(requerimiento);
    }
    
}
