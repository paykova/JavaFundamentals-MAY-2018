package p03_Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        double radius = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        double weight = Double.parseDouble(reader.readLine());

        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(height, weight);

        circle.calculateArea();
        circle.calculatePerimeter();

        rectangle.calculatePerimeter();
        rectangle.calculateArea();
    }
}
