package corejava.class_practice_problem;

public class StaticBlockNonStaticBlock {
    {
        System.out.println("Hii non static block");
    }

    static{
        System.out.println("hii i am static block");
    }
    public StaticBlockNonStaticBlock(){
        System.out.println("hii i am constructor");
    }

    public static void main(String[] args){
        System.out.println(" hii main method ");
        StaticBlockNonStaticBlock d = new StaticBlockNonStaticBlock();
    }
}
