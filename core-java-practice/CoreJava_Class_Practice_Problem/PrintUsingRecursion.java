package corejava.class_practice_problem;

public class PrintUsingRecursion {
    public void print(int n){
        if(n > 4) return;

        System.out.println(n);
//        n++
        print(n+1);
    }

    public static void main(String[] args) {
        PrintUsingRecursion ob = new PrintUsingRecursion();
        ob.print(1);

    }
}
