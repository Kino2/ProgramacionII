package TP06;

public abstract class Item {
    protected double precio;

    public Item(double precio){
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract boolean sePuedeAlquilar();
    public abstract void alquilar();
}
