package Vivero;

public class FiltroXNombreIncluido extends Filtro {
    private String nombre;

    public FiltroXNombreIncluido() {
        nombre = "aureum";
        nombre.toLowerCase();
    }
    
    public boolean cumple(Planta planta){
        return planta.getNombre().contains(nombre);
    }
}
