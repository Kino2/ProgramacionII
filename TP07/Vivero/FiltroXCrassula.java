package Vivero;

public class FiltroXCrassula extends Filtro {
    private String clasSuperior;

    public FiltroXCrassula() {
        clasSuperior = "Crassula";
        clasSuperior.toLowerCase();
    }

    public boolean cumple(Planta planta){
        return planta.getClasificacionSuperior().toLowerCase().equals(clasSuperior);
    }
}
