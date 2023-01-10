package Opgave15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(3);
        Square square2 = new Square(6);
        Square square3 = new Square(1);

        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle(2);
        Circle circle4 = new Circle(3);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(circle4);

        for (Shape shape : shapes) {
            System.out.printf("shape #%d: area = %f\n", shapes.indexOf(shape), shape.getArea());
        }
    }
}
