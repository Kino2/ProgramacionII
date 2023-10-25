package TP11.Recuperatorio2021;

public class Main {
    public static void main(String[] args) {
        FiltroPesoMenor filtro = new FiltroPesoMenor(40);
        FiltroPesoSuperior filtro2 = new FiltroPesoSuperior(20);
        FiltroPesoSuperior filtro3 = new FiltroPesoSuperior(20);

        Combo c1 = new Combo("Combito", filtro2, 0.2, 0.5);
        Combo c2 = new Combo("Combazo", filtro2, 0.2, 0.5);
       
        Producto p1 = new Producto(30, 660);
        p1.addCategoria("Limpieza");
        p1.addCategoria("Bienestar");

        Producto p2 = new Producto(100, 1300);
        p2.addCategoria("Belleza");
        p2.addCategoria("Bienestar");


        c2.addElemento(p1);
        c2.addElemento(p2);

        System.out.println(c2.getPrecio());
    }
}
