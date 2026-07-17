package oops_practice.gcrcodebase.encapsulation_and_abstraction.shapehierarchy;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 5);
        shapes[2] = new Triangle(3, 4, 5);

        System.out.println("Shape Area Report");
        System.out.println("-----------------");

        for (Shape shape : shapes) {

            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}