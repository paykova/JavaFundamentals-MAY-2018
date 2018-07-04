package p01_ShapesDrawing;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(10, 10);

        circle.draw();
        rect.draw();

    }
}
