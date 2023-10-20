package TP05.Pila;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila(10);
        pila.push(0);
        pila.push(10);
        pila.push(15);
        pila.push(29);
        pila.push(29);
        pila.push(29);
        pila.push(29);
        pila.push(29);
        pila.push(292);
        pila.push(29);
        pila.push(29);
        pila.push(29);
        pila.push(292);



        pila.copy();
        System.out.println();
        pila.reverse();
    }
}
