// Task
// Student grade system using conditional statement



package corejava.class_practice_problem;
import java.util.*;
public class StudentGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("grade A");
        } else if (marks >= 80 && marks <90) {
            System.out.println("grade B");
        }else if (marks >= 70 && marks < 80) {
            System.out.println("grade C");
        }else if (marks >= 60 && marks < 60) {
            System.out.println("grade D");
        }else{
            System.out.println("fail");
        }
    }
}
