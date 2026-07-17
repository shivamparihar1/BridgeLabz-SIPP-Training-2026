package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_2;

public class StudentReport {

    String name;
    int rollNumber;
    int marks;

    StudentReport(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Student Report");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        StudentReport student = new StudentReport("Shivam", 101, 88);

        student.displayDetails();
    }
}