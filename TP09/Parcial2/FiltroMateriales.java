package Parcial2;

import java.util.ArrayList;

public class FiltroMateriales extends Filtro {
    private String material;

    public FiltroMateriales(String material) {
        this.material = material;
    }

    @Override
    public boolean cumple(Tarea t) {
        ArrayList<String> materiales = t.getMatNecesarios();
        return materiales.contains(material);
    }

}
