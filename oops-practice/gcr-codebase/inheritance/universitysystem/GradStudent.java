package oops_practice.gcrcodebase.inheritance.universitysystem;
public class GradStudent extends Student {

    String thesis;

    public GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                "\nThesis: " + thesis;
    }
}