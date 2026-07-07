package corejava.class_practice_problem;

public class FibbonacciUsingRecursion {
    static int fibbonacci(int n){
        if(n <= 1) return n;
        int res = fibbonacci(n-1)+fibbonacci(n-2);
        return res;

    }

    public static void main(String[] args) {
        System.out.println(fibbonacci(6));
    }
}
