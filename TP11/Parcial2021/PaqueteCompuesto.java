package TP11.Parcial2021;

import java.time.LocalDate;
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

    @Override
    public double getCosto() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getDestino() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LocalDate getFecha() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getOrigen() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LocalDate getfechaPago() {
        LocalDate fechaMayor = LocalDate.of(0, 0, 0);
        for (PaqueteTuristico p : paquetes) {
            if (p.getFecha() != null && p.getFecha().isAfter(fechaMayor)) {
                fechaMayor = p.getFecha();
            } else {
                fechaMayor = null;
                return fechaMayor;
            }
        }
        return fechaMayor;
    }

}
