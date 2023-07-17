public class Circle extends GeometricFigure{
    private double radius;
    final static double PI = 3.141592;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getFigurePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getFigureSquare() {
        return PI * Math.pow(radius, 2);
    }
}
