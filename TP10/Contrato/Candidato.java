package Contrato;

public class Candidato {
    private String nombre;
    private String empresa;
    private double sueldo;
    private CriterioAceptacion criterio;
    private boolean exclusivo;

    public Candidato(String nombre, String empresa, double sueldo, CriterioAceptacion criterio, boolean exclusivo) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.sueldo = sueldo;
        this.criterio = criterio;
        this.exclusivo = exclusivo;
    }

    public boolean cumpleCriterio(OfertaLaboral oferta) {
        if (isExclusivo()) {
            return false;
        } else {
            return criterio.cumpleCriterio(oferta, this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setCriterio(CriterioAceptacion criterio) {
        this.criterio = criterio;
    }

    public boolean isExclusivo() {
        return exclusivo;
    }

    @Override
    public String toString() {
        return "Candidato [nombre=" + nombre + ", empresa=" + empresa + ", sueldo=" + sueldo
                + "]";
    }

    public boolean equals(Object o) {
        Candidato c = (Candidato) o;
        try {
            return this.getNombre().equals(c.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
