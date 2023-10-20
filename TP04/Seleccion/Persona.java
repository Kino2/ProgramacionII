package TP04.Seleccion;


public class Persona {
    protected String nombre;
    protected String apellido;
    protected String estado;
    protected int numPasaporte;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellido,
            String estado, int numPasaporte, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEstado(estado);
        this.numPasaporte = numPasaporte;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstado(String estado) {
        if (estado.equals("En concentracion") || estado.equals("Viajando") || estado.equals("En pais de origen")) {
            this.estado = estado;
        } else {
            System.out.println("Estado no válido");
        }
    }

    public void estaDisponible() {
        if (estado.equals("En pais de origen") && !(estado.equals("En concentracion"))) {
            System.out.println("Está disponible");
        } else {
            System.out.println("No está disponible");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
