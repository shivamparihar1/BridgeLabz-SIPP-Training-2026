package oops_practice.oops_class_practice_problem.Interface;

class CalculatorImpl implements Calculator{
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void subtract(int a, int b){
        System.out.println(a-b);
    }

    public void multiply(int a, int b){
        System.out.println(a*b);
    }

    public void divide(int a, int b){
        System.out.println(a/b);
    }
}

