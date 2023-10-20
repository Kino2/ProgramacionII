package Vivero;

public class FiltroXInteriorYRiego extends Filtro {
    private String prosperaEn;

    public FiltroXInteriorYRiego() {
        prosperaEn = "Interior";
        prosperaEn.toLowerCase();
    }

    public boolean cumple(Planta planta) {
        return planta.getProsperaEn().toLowerCase().equals(prosperaEn) && planta.getRiego() < 3;
    }
}
