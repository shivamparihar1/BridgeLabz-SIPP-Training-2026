package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_1;

public class CircleArea {

    double radius;

    CircleArea(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Circle Details");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {

        CircleArea circle = new CircleArea(5);

        circle.displayDetails();
    }
}