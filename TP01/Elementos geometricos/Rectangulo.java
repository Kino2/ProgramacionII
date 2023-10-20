public class Rectangulo {
    private ElementoGeometrico puntoSuperiorIzquierdo;
    private ElementoGeometrico puntoInferiorDerecho;

    public Rectangulo (ElementoGeometrico puntoSuperiorIzquierdo, ElementoGeometrico puntoInferiorDerecho) {
        this.puntoSuperiorIzquierdo = puntoSuperiorIzquierdo;
        this.puntoInferiorDerecho = puntoInferiorDerecho;
    }

    public void desplazar(double desX, double desY){
        puntoSuperiorIzquierdo.desplazar(desX, desY);
        puntoInferiorDerecho.desplazar(desX, desY);
    }

    public double obtenerArea(){
        double ancho = Math.abs(puntoSuperiorIzquierdo.getX() - puntoInferiorDerecho.getX());
        double alto = Math.abs(puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY());
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
        double ancho = Math.abs(puntoSuperiorIzquierdo.getX() - puntoInferiorDerecho.getX());
        double alto = Math.abs(puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY());
        return (ancho == alto);
    }

    public double largoLadoSuperior(){
        return Math.abs(puntoSuperiorIzquierdo.getX() - puntoInferiorDerecho.getX());
    }

    public String acostadoOparado(){
        String paradoOacostado;
        double ancho = Math.abs(puntoSuperiorIzquierdo.getX() - puntoInferiorDerecho.getX());
        double alto = Math.abs(puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY());
        if(ancho > alto){
            paradoOacostado = "El rectángulo está acostado";
        } else {
            paradoOacostado = "El rectángulo está parado";
        }
        return paradoOacostado;
    }
}
