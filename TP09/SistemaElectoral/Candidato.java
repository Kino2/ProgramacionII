package SistemaElectoral;

public class Candidato {
    private String nombre;
    private String partido;
    private String agrupacion;

    public Candidato(String nombre, String partido, String agrupacion) {
        this.nombre = nombre;
        this.partido = partido;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Candidato [nombre=" + nombre + ", partido=" + partido + ", agrupacion=" + agrupacion + "]";
    }

    public String getPartido() {
        return partido;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

}
