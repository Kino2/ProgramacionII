package SistemaElectoral;

import java.util.Comparator;

public class Comparador implements Comparator<Candidato> {
    private ComparadorAgrupacion compAgru;
    private ComparadorPartido compParti;
    private ComparadorNombre compNombre;

    public Comparador() {
        compAgru = new ComparadorAgrupacion();
        compParti = new ComparadorPartido();
        compNombre = new ComparadorNombre();
    }

    public int compare(Candidato c1, Candidato c2) {
        int comparacionPorPartido = compParti.compare(c1, c2);
        if (comparacionPorPartido != 0) {
            return comparacionPorPartido;
        }

        int comparacionPorAgrupacion = compAgru.compare(c1, c2);
        if (comparacionPorAgrupacion != 0) {
            return comparacionPorAgrupacion;
        }

        // Si los partidos y las agrupaciones son iguales, compara por nombre
        return compNombre.compare(c1, c2);
    }
}
