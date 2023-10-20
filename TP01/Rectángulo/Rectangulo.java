public class Rectangulo {
    private ElementoGeometrico puntoSuperiorIzquierdo;
    private double ancho;
    private double alto;

    public Rectangulo (double ancho, double alto){
        this.puntoSuperiorIzquierdo = new ElementoGeometrico();
        this.ancho = ancho;
        this.alto = alto;
    }
    public Rectangulo (ElementoGeometrico puntoSuperiorIzquierdo, double ancho, double alto) {
        this.puntoSuperiorIzquierdo = puntoSuperiorIzquierdo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void desplazar(double desX, double desY){
        puntoSuperiorIzquierdo.desplazar(desX, desY);
    }

    public double obtenerArea(){
        double area = ancho * alto;
        return area;
    }

    public int compararRectangulo(Rectangulo otroRectangulo){
        double areaEsteRectangulo = this.obtenerArea();
        double areaOtroRectangulo = otroRectangulo.obtenerArea();
        if(areaEsteRectangulo > areaOtroRectangulo){
            return 1;
        } else if (areaEsteRectangulo == areaOtroRectangulo){
            return 0;
        } else {
            return -1;
        }
    }

    public boolean esCuadrado(){
        return (ancho == alto);
    }

    public double largoLadoSuperior(){
        return ancho;
    }

    public String acostadoOparado(){
        String paradoOacostado;
        if(ancho > alto){
            paradoOacostado = "El rectángulo está acostado";
        } else {
            paradoOacostado = "El rectángulo está parado";
        }
        return paradoOacostado;
    }
}
