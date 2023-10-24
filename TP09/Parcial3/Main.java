package Parcial3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> equipamientoCama1 = new ArrayList<>();
        equipamientoCama1.add("Sábanas");
        equipamientoCama1.add("Almohadas");

        ArrayList<String> equipamientoCama2 = new ArrayList<>();
        equipamientoCama2.add("Sábanas");
        equipamientoCama2.add("Colchas");

        ArrayList<String> equipamientoCama3 = new ArrayList<>();
        equipamientoCama3.add("Sábanas");
        equipamientoCama3.add("Mantas");

        Cama cama1 = new Cama(equipamientoCama1);
        Cama cama2 = new Cama(equipamientoCama2);
        Cama cama3 = new Cama(equipamientoCama3);

        ArrayList<String> sintomasPaciente1 = new ArrayList<>();
        sintomasPaciente1.add("Fiebre");
        sintomasPaciente1.add("Dolor de cabeza");

        ArrayList<String> sintomasPaciente2 = new ArrayList<>();
        sintomasPaciente2.add("Tos");
        sintomasPaciente2.add("Congestión nasal");

        ArrayList<String> sintomasPaciente3 = new ArrayList<>();
        sintomasPaciente3.add("Dolor de garganta");
        sintomasPaciente3.add("Fatiga");

        ArrayList<String> equipamientoPaciente1 = new ArrayList<>();
        equipamientoPaciente1.add("Mascarilla");
        equipamientoPaciente1.add("Termómetro");

        ArrayList<String> equipamientoPaciente2 = new ArrayList<>();
        equipamientoPaciente2.add("Mascarilla");
        equipamientoPaciente2.add("Jarabe para la tos");

        ArrayList<String> equipamientoPaciente3 = new ArrayList<>();
        equipamientoPaciente3.add("Mascarilla");
        equipamientoPaciente3.add("Pastillas para el dolor de garganta");

        Paciente paciente1 = new Paciente("Juan", 30, sintomasPaciente1, equipamientoPaciente1);
        Paciente paciente2 = new Paciente("María", 25, sintomasPaciente2, equipamientoPaciente2);
        Paciente paciente3 = new Paciente("Carlos", 40, sintomasPaciente3, equipamientoPaciente3);

        RequerimientoEdad req = new RequerimientoEdad(27);
        cama1.addPaciente(paciente1,req);
        cama2.addPaciente(paciente2,req);
        cama3.addPaciente(paciente3,req);
        
        Compuesto compuesto = new Compuesto();
        compuesto.addComponente(cama1);
        compuesto.addComponente(cama2);
        compuesto.addComponente(cama3);

    
        System.out.println(compuesto.copia(req));
    }
}
