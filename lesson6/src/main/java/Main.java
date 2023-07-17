public class Main {
    public static void main(String[] args)  {
        Main main = new Main();
        //1. Задание
        Circle circle = new Circle(5);
        Rectangle rectangle1 = new Rectangle(3, 5);
        Rectangle rectangle2 = new Rectangle(4, 6);
        Triangle triangle1 = Triangle.isTriangleExist(3, 5,6);
        Triangle triangle2 = Triangle.isTriangleExist(5, 3,3);
        GeometricFigure[] figures = new GeometricFigure[]{circle, triangle1, triangle2, rectangle1, rectangle2};
        System.out.println(main.getPerimetersSum(figures));
        //2. Задание
        Boss boss = new Boss();
        boss.getProfInfo();
        Worker worker = new Worker();
        worker.getProfInfo();
        Accountant accountant = new Accountant();
        accountant.getProfInfo();
    }
    public double getPerimetersSum(GeometricFigure[] figures){
        double sum = 0;
        for (GeometricFigure figure: figures) {
            sum += figure.getFigurePerimeter();
        }
        return sum;
    }
}
