package oops_practice.oops_class_practice_problem.shapehirerchy;
import java.util.*;

public class ShapeMenu extends ShapeMenuAbs {
    Shape s;
//    Shape ob2 = new Triangle();
//    Shape 0b3 = new Rectangle();

    @Override
    public void choices(){

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit");
        int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Rectangle r= new Rectangle();
                    r.setBreadth(10);
                    r.setLength(10);
                    r.area();
                    r.perimeter();
                    break;

                case 2:
                    s = new Triangle();
                    s.area();
                    s.perimeter();
                    break;

                case 3:
                    s = new Circle();
                    s.area();
                    s.perimeter();
                    break;
                case 4:
                    System.out.println("Exit");

                default:
                    System.out.println("invalide choice");
            }





    }
}
