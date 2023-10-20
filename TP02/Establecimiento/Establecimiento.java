package TP02.Establecimiento;

import java.util.ArrayList;

public class Establecimiento {
    private ArrayList<Usuario> socios;

    public Establecimiento() {
        this.socios = new ArrayList<>();
    }

    public void reservarTurno(Usuario usuario, Cancha cancha) {
        int precio = 0;
        usuario.registrarTurnos();
        if (usuario.getTurnos() >= 4) {
            socios.add(usuario);
        }
        if (esSocio(usuario)) {
            precio = cancha.getPrecio();
            cancha.setPrecio(precio *= 0.9);
            System.out.println(cancha.getPrecio());
        }
    }

    public boolean esSocio(Usuario usuario) {
        return socios.contains(usuario);
    }
}
