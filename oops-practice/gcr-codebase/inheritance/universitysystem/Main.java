package oops_practice.gcrcodebase.inheritance.universitysystem;
public class Main {

    public static void main(String[] args) {

        GradStudent student = new GradStudent(
                "Shivam",
                22,
                101,
                8.8,
                "Artificial Intelligence Research"
        );

        System.out.println(student);

        System.out.println();

        System.out.println("IS-A Relationship Check");

        System.out.println(student instanceof GradStudent);

        System.out.println(student instanceof Student);

        System.out.println(student instanceof Person);
    }
}