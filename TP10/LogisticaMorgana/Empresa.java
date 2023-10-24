package LogisticaMorgana;

import java.util.ArrayList;

public class Empresa {
    private int capacidadMinima;
    private ArrayList<Combo> combos;
    private ArrayList<Combo> combosExpress;
    private ArrayList<Combo> combosPromocionales;

    public Empresa(int capacidadMinima) {
        this.capacidadMinima = capacidadMinima;
        combos = new ArrayList<>();
        combosExpress = new ArrayList<>();
        combosPromocionales = new ArrayList<>();
    }

    public void addCombo(Combo combo) {
        if (!combos.contains(combo) && combo.getCantidad() >= capacidadMinima) {
            combos.add(combo);
        } else {
            System.out.println("no se puedo agregar");
        }
    }

    public void addComboExpress(Combo combo) {
        if (!combosExpress.contains(combo) && combo.getCantidad() >= capacidadMinima
                && combo.getDestino().equalsIgnoreCase("Corea")) {
            combosExpress.add(combo);
        } else {
            System.out.println("no se puedo agregar");
        }
    }

    public void addComboPromocional(Combo combo) {
        if (!combosPromocionales.contains(combo) && combo.getCantidad() >= capacidadMinima) {
            combo.setCostoEnvioPromedio();
            combosPromocionales.add(combo);
            System.out.println(combo.setCostoEnvioPromedio());
        } else {
            System.out.println("no se puedo agregar");
        }
    }

    public int getCapacidadMinima() {
        return capacidadMinima;
    }

    public ArrayList<Combo> getCombos() {
        return combos;
    }

    public ArrayList<Combo> getCombosExpress() {
        return combosExpress;
    }

    public ArrayList<Combo> getCombosPromocionales() {
        return combosPromocionales;
    }
}
