package TP04.RegistroEmpresa;

public class Usuario extends Empresa {
    private String usuario;
    private String password;

    public Usuario(String nombre, String apellido, int edad, String usuario, String password) {
        super("Usuario final", nombre, apellido, edad);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String showInfo() {
        if (super.existeCargo()) {
            return super.showInfo() + "\nNombre de usuario: " + usuario + "\nPassword: " + password;
        } else {
            return "No existe ese cargo";
        }
    }
}
