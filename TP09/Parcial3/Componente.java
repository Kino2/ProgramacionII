package Parcial3;

import java.util.ArrayList;

public abstract class Componente {
    public abstract ArrayList<Cama> getCamasDisponibles();
    public abstract int getCantidadCamas();
    public abstract Componente copia(Requerimiento req);
}
