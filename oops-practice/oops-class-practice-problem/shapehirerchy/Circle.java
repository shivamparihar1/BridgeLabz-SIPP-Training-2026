package oops_practice.oops_class_practice_problem.shapehirerchy;

public class Circle extends Shape {
    private int radius;
    private final float pi = 3.14f;
    Circle c;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void area(){
        c = new Circle();
        System.out.println("area of circle:-"+pi*c.radius*c.radius);
    }
    @Override
    public void perimeter(){
        c = new Circle();
        System.out.println("perimeter of circle:-"+2*pi*c.radius);
    }
}
