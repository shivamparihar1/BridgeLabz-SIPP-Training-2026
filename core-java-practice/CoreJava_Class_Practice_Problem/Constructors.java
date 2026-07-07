package corejava.class_practice_problem;

public class Constructors {
    public Constructors(){
        System.out.println("hii 1");
    }
    public Constructors(int a, int b){
        System.out.println("hii 2");
    }
    public Constructors(double a){
        System.out.println("hii 3");
    }

    public static void main(String[] args) {
         Constructors c = new Constructors();// hii 1
    }
}
