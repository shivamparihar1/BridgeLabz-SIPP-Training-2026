package oops_practice.oops_class_practice_problem.university;

public class Student extends Person {
    protected int studentId;
    protected double studentGpa;

    public Student(int id, String name, int studentId, double studentGpa){
        super(id, name);
        this.studentId=studentId;
        this.studentGpa=studentGpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentGpa=" + studentGpa +
                ", personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }

}
