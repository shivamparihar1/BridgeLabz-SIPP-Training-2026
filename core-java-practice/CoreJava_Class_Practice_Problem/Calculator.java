package corejava.class_practice_problem;

public class Calculator {
    int a;
    int b;
    int c;
    public Calculator(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void add(int a, int b){
        c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args){

    }

    public void subtract(int a, int b){
        c = a - b;
        System.out.println(c);
    }
}
