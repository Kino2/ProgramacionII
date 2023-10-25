package TP11.Parcial2021;

import java.util.ArrayList;

public class PaqueteCompuesto extends PaqueteTuristico {
    ArrayList<PaqueteTuristico> paquetes;

    public PaqueteCompuesto() {
        paquetes = new ArrayList<>();
    }

    public void addPaquete(PaqueteTuristico p) {
        if (!paquetes.contains(p)) {
            paquetes.add(p);
        }
    }

    public 


}
