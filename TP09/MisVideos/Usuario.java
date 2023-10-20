package MisVideos;

public class Usuario {
    private String nombre;
    private int anio;
    private String email;

    public Usuario(String nombre, int anio, String email) {
        this.nombre = nombre;
        this.anio = anio;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public String getEmail() {
        return email;
    }

}
