package TP05.Pila;

public class Pila extends Object {
    private Integer[] pila;
    private int cantidad;

    public Pila(int capacidad) {
        pila = new Integer[capacidad];
        cantidad = 0;
    }

    public void push(int numero) {
        if (cantidad >= pila.length) {
            Integer[] nuevo = new Integer[cantidad * 2];
            for (int i = 0; i < pila.length; i++) {
                nuevo[i] = pila[i];
            }
            nuevo[cantidad] = numero;
            cantidad++;
            pila = nuevo;
        } else {
            pila[cantidad] = numero;
            cantidad++;
        }
    }

    public int pop() {
        int aux = pila[cantidad - 1];
        borrarElemento(cantidad - 1);
        return aux;
    }

    public int top() {
        return pila.length;
    }

    public int size() {
        return cantidad;
    }

    public void copy() {
        Integer[] copia = new Integer[pila.length];
        for (int i = 0; i < cantidad; i++) {
            copia[i] = pila[i];
            System.out.println(copia[i]);
        }
    }

    public void reverse() {
        int aux = 0;
        for (int i = 0; i < cantidad/2; i++) {
            aux = pila[i];
            pila[i] = pila[cantidad-1-i];
            pila[cantidad-1-i] = aux;
        }
        for(int i = 0; i<cantidad-1; i++){
             System.out.println(pila[i]);
        }
    }

    public void borrarElemento(int pos) {
        for (int i = pos; i < pila.length - 1; i++) {
            pila[i] = pila[i + 1];
        }
    }
}
