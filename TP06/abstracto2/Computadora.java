package abstracto2;

public class Computadora extends ElementoCola {
    private double velocidadCPU;
    private String nombre;
    private Proceso proc;

    public Computadora(double velocidadCPU, String nombre) {
        this.velocidadCPU = velocidadCPU;
        this.nombre = nombre;
        proc = null;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public void setVelocidadCPU(double velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getVelocidadCPU() > ((Computadora) otro).getVelocidadCPU();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutarProceso(Proceso p) {
        this.proc = p;
        System.out.println(proc.ejecutar() + " en la pc: " + nombre);
    }

    @Override
    public String toString() {
        return "Computadora [velocidadCPU=" + velocidadCPU + ", nombre=" + nombre + "]";
    }

}
