package Parcial;

import java.util.ArrayList;

public class PresupuestoUrgente extends Componente {
    private static double aumentoCosto = 0.5;
    private ArrayList<Componente> componentes;

    public PresupuestoUrgente(String nombre, ArrayList<String> matNecesarios, double costo, int empleadosAfectados,
            int tiempoEstimado, double descuento) {
        super(nombre, matNecesarios, costo, empleadosAfectados, tiempoEstimado);
        componentes = new ArrayList<>();
    }

    
    public static double getAumentoCosto() {
        return aumentoCosto;
    }


    public static void setAumentoCosto(double aumentoCosto) {
        PresupuestoUrgente.aumentoCosto = aumentoCosto;
    }


    @Override
    public double getCosto() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEmpleadosAfectados() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<String> getMatNecesarios() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getTiempoEstimado() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
