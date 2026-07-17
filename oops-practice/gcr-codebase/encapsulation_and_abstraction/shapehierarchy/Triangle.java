package oops_practice.gcrcodebase.encapsulation_and_abstraction.shapehierarchy;
public class Triangle extends Shape {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(
                s * (s - side1) *
                        (s - side2) *
                        (s - side3)
        );
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}