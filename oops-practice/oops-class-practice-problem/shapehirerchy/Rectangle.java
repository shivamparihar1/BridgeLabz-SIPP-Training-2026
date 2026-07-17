package oops_practice.oops_class_practice_problem.shapehirerchy;

public class Rectangle extends Shape{
    private int length;

    private int breadth;
     Rectangle g;

    public void setLength(int length){
        this.length = length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    @Override
    public void area(){

        System.out.println("Area of rectangle is :-"+(length*breadth));
    }
    @Override
    public void perimeter(){

        System.out.println("perimeter of rectangle:-"+(2*(length+breadth)));
    }

}
