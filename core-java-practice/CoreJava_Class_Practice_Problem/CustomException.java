package corejava.class_practice_problem;
import java.util.*;

public class CustomException {
    public static void main(String [] args) throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();


        if(age > 100){
            throw new MyException("exception handled");
        }
    }
}
 class MyException extends Exception{



     public MyException(String exceptionHandled) {
         super();
     }
 }
