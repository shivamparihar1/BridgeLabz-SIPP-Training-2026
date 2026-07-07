package corejava.class_practice_problem;

public class FactorialUsingRecursion {
    static int factorial(int n){
        if(n==0 || n==1) return 1;

        int res = n * factorial(n-1);
        return res;

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
