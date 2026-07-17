package corejava.class_practice_problem;
import java.util.*;
public class MathWizard {

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int fact(int n){
        int facto = 1;
        for(int i = 1; i <= n; i++){
            facto =  i*facto;
        }
        return facto;
    }
//    public int fibbonacci(int n){
//        if (n == 0)
//            return 0;
//        if (n == 1)
//            return 1;
//
//        int first = 0, second = 1, next = 0;
//
//        for (int i = 2; i <= n; i++) {
//            next = first + second;
//            first = second;
//            second = next;
//        }
//
//        return next;
//    }
//
//    public double fibbonacci(double n){
//        if (n == 0)
//            return 0;
//        if (n == 1)
//            return 1;
//
//        int first = 0, second = 1, next = 0;
//
//        for (int i = 2; i <= n; i++) {
//            next = first + second;
//            first = second;
//            second = next;
//        }
//
//        return next;
//    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter choice");
        int choice = scanner.nextInt();
        switch (choice){

            case 1:
//                System.out.println("Enter a number");
                boolean prime = MathWizard.isPrime(12);
                System.out.println(prime);
                break;

            case 2:
//                System.out.println("Enter a number");
//                int n = scanner.nextInt();
                int factorial = MathWizard.fact(5);
                System.out.println(factorial);
                break;
        }
    }
}
