package p03_Shape;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    void calculatePerimeter() {
        double result = this.height * this.width;
        System.out.println(result);
    }

    @Override
    void calculateArea() {
        double result = this.height * 2 + this.width * 2;
        System.out.println(result);
    }
}
