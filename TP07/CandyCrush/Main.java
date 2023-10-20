package CandyCrush;

public class Main {
    public static void main(String[] args) {
        Ficha ficha = new Ficha("Chocolate", 1, 1, 0);
        Ficha ficha2 = new Ficha("Piedra", 6, 1, 0);
        Ficha ficha3 = new Ficha("Caramelo a rayas", 1, 1, 10);
        Ficha ficha4 = new Ficha("Torta", 4, 8, 4);
    
        Tablero tablero = new Tablero(20);
        tablero.addFicha(ficha);
        tablero.addFicha(ficha2);
        tablero.addFicha(ficha3);
        tablero.addFicha(ficha4);

        Filtro filtro = new FiltroFortMayorA5();

        
        System.out.println(tablero.realizarBusqueda(filtro));
        tablero.calcularDificultad();
    }
}
