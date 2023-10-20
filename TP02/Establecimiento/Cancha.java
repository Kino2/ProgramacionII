package TP02.Establecimiento;

public class Cancha {
    private String tipo;
    private int precio;

    public Cancha(String tipo) {
        this.tipo = tipo;
        if(tipo.equals("Futbol 5")){
            precio = 400;
        } else if (tipo.equals("Paddle")){
            precio = 100;
        } else {
            System.out.println("Tipo de cancha no válida");
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
}
