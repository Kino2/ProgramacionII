package Vivero;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Planta> plantas;

    public Sistema() {
        plantas = new ArrayList<>();
    }

    public void addPlanta(Planta planta){
        if(!plantas.contains(planta)){
            plantas.add(planta);
        }
    }
    public ArrayList<Planta> filtradoDePlantas(Filtro f) {
        ArrayList<Planta> retorno = new ArrayList<>();
        for (int i = 0; i < plantas.size(); i++) {
            Planta planta = plantas.get(i);
            if (f.cumple(planta)) {
                plantas.add(planta);
            }
        }
        return retorno;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

}
