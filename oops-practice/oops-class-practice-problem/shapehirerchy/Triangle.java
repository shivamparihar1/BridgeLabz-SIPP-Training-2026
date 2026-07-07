package oops_practice.oops_class_practice_problem.shapehirerchy;

public class Triangle extends Shape{
    private int base;
    private int height;
    Triangle t;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void area(){
        t =  new Triangle();
        System.out.println("area of triangle:-"+1/2*(t.base*t.height));
    }
    @Override
    public void perimeter(){
        t =  new Triangle();
        System.out.println("perimeter of triangle:-"+3*(t.base));
    }
}
