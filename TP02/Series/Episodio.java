package TP02;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        visto = false;
        calificacion = -1;
    }

    public void ingresarCalificacion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 5) {
            this.setCalificacion(calificacion);
            this.setVisto(true);
        } else {
            System.out.println("No se puede ingresar valores que no estén entre 1 y 5");
        }
    }

    public int totalVistos() {
        int total = 0;
        if (this.visto == true) {
            total++;
        }
        return total;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public boolean getVisto() {
        return visto;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
