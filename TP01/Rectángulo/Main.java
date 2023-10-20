public class Main {
    public static void main (String [] args){
        ElementoGeometrico PuntoA = new ElementoGeometrico(9, 12);
        ElementoGeometrico PuntoB = new ElementoGeometrico(7, 4);
        ElementoGeometrico PuntoC = new ElementoGeometrico(6, 8);

        Rectangulo rectangulo = new Rectangulo(50, 70);
        Rectangulo otroRectangulo = new Rectangulo(PuntoC, 44, 61);

        PuntoB.desplazar(4, 4);
        System.out.println("El punto B ha sido desplazado a las coordenadas (" + PuntoB.getX() + ", " + PuntoB.getY() + ")");
        System.out.println("La distancia euclidea es " + PuntoA.distanciaEuclidea(PuntoB));
        System.out.println();

        rectangulo.desplazar(5,6);
        System.out.println("El area del rectángulo es: " + rectangulo.obtenerArea());
        int resultado = rectangulo.compararRectangulo(otroRectangulo);
        if(resultado == 1){
            System.out.println("El area del rectangulo es mayor que el otro");
        } else if (resultado == 0){
            System.out.println("Los areas son iguales");
        } else {
            System.out.println("El area del otro es mayor");
        }

        boolean esCuadrado = rectangulo.esCuadrado();
        if(esCuadrado){
            System.out.println("Es cuadrado");
        } else {
            System.out.println("No es cuadrado");
        }
        System.out.println("El largo del lado superior es: " + rectangulo.largoLadoSuperior());
        System.out.println(rectangulo.acostadoOparado());
    } 

        
}
