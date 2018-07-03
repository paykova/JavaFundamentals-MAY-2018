package p03_Shape;


public class Circle extends Shape{

    private static final double NUMBER_PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    void calculatePerimeter() {
        double result = 2 * this.radius * NUMBER_PI;
        System.out.println(result);
    }

    @Override
    void calculateArea() {
        double result = this.radius * this.radius * NUMBER_PI;
        System.out.println(result);
    }
}
