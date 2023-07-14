public class Triangle extends GeometricFigure{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getFigurePerimeter() {
        return a + b + c;
    }

    @Override
    public double getFigureSquare() {
        double p = (a + b + c) / 2;  //полупериметр треугольника
        double hA = Math.sqrt(p * (p - a) * (p - b) * (p - c)) / 2; //высота треугольника к стороне а
        return (a * hA) / 2;
    }
    public static Triangle isTriangleExist(double a, double b, double c){
        if ((a + b) > c & (b + c) > a & (c + a) > b) return new Triangle(a , b, c);
        else return null;
    }
}
