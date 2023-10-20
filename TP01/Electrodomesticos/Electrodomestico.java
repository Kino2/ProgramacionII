package Electrodomesticos;

public class Electrodomestico {
    String nombre;
    double precio;
    String color;
    int consumo;
    double peso;

    public Electrodomestico() {
        this.color = "Gris plata";
        this.consumo = 10;
        this.precio = 100;
        this.peso = 2;
    }

    public Electrodomestico(String nombre){
        this.nombre = nombre;
        this.color = "Gris plata";
        this.consumo = 10;
        this.precio = 100;
        this.peso = 2;
    }

    public Electrodomestico(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
        this.consumo = 10;
        this.precio = 100;
        this.peso = 2;
    }

    public Electrodomestico(String nombre, double precio){
        this.nombre = nombre;
        this.color = "Gris plata";
        this.consumo = 10;
        this.precio = precio;
        this.peso = 2;
    }

    public Electrodomestico(String nombre, String color, int consumo, double precio, int peso){
        this.nombre = nombre;
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.peso = peso;   
    }

    public boolean bajoConsumo(){
        return peso < 45;
    }

    public double calculoBalance(){
        return precio/peso;
    }
    
    public boolean esAltaGama(){
        double balance = calculoBalance();
        return balance > 3;
    }

    //Métodos get 
    public String getNombre (){
        return nombre;
    } 

    public double getPrecio(){
        return precio;
    }

    public String getColor(){
        return color;
    }

    public int getConsumo(){
        return consumo;
    }

    public double getPeso(){
        return peso;
    }

    //Métodos set 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setConsumo(int consumo){
        this.consumo = consumo;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
}
