package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;
public class CircleConstructorChaining {

    double radius;

    CircleConstructorChaining() {
        this(5.0);
    }

    CircleConstructorChaining(double radius) {
        this.radius = radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {

        CircleConstructorChaining circle1 = new CircleConstructorChaining();

        CircleConstructorChaining circle2 = new CircleConstructorChaining(10);

        System.out.println("Default Constructor");
        circle1.displayDetails();

        System.out.println();

        System.out.println("Parameterized Constructor");
        circle2.displayDetails();
    }
}