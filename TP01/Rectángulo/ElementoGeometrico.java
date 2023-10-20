import java.lang.Math;

public class ElementoGeometrico {
    private double X;
    private double Y;

    public ElementoGeometrico() {
        this.X = 0;
        this.Y = 0;
    }

    public ElementoGeometrico(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public void desplazar(double desX, double desY) {
        this.X += desX;
        this.Y += desY;
    }

    public double distanciaEuclidea(ElementoGeometrico otroPunto) {
        double deltaX = this.X - otroPunto.getX();
        double deltaY = this.Y - otroPunto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Getters
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    // Setters
    public void setX(double X) {
        this.X = X;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
}
