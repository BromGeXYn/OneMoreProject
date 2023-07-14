public class Rectangle extends GeometricFigure{

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getFigurePerimeter() {
        return (height + width) * 2;
    }

    @Override
    public double getFigureSquare() {
        return height * width;
    }
}
