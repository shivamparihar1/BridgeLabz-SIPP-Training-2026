package oops_practice.gcrcodebase.inheritance.universitysystem;

public class Student extends Person {

    final int studentId;
    double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                "\nStudent ID: " + studentId +
                "\nGPA: " + gpa;
    }
}