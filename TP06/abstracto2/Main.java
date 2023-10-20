package abstracto2;

public class Main {
    public static void main(String[] args) {
        CentroComputo centro = new CentroComputo();
        

        Computadora pc1 = new Computadora(500, "Kino");
        Computadora pc2 = new Computadora(420, "rapida");

        Proceso proceso1 = new Proceso("hola", 200);
        Proceso proceso2 = new Proceso("ea", 400);
        
        centro.addComputadora(pc1);
        centro.addComputadora(pc2);
        centro.addProceso(proceso1);
        centro.addProceso(proceso2); 

        

    }
}
