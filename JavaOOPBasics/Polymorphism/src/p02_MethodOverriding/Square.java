package p02_MethodOverriding;

public class Square extends Rectangle{

    @Override
    public double area() {
        super.area();
       return super.getSideA() * super.getSideA();
    }

    public Square(double sideA) {
        super(sideA, sideA);
    }
}
