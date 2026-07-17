package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable.universitymanagement;

public class Main {

    public static void main(String[] args) {

        PostgraduateStudent student = new PostgraduateStudent(
                101,
                "Shivam",
                8.7,
                "Artificial Intelligence"
        );

        student.displayDetails();

        student.setCGPA(9.2);

        System.out.println();
        System.out.println("After Updating CGPA");
        System.out.println("CGPA: " + student.getCGPA());
    }
}