package oops_practice.oops_class_practice_problem.encapsulation;

public class StudentUtililty {
    public static void main(String[] args){
        Student s = new Student();

        s.setID(101);
        s.setName("Sahil");

        System.out.println(s.getID());
        System.out.println(s.getName());
    }
}
