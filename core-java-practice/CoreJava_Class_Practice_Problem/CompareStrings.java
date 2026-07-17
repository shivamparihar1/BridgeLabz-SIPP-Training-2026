package corejava.class_practice_problem;

public class CompareStrings {
    private  static void Print(){
        System.out.println("shivam parihar");
        CompareStrings ob1 = new CompareStrings();
        ob1.PrintS();
    }
    private void PrintS(){
        System.out.println("shivam parihar ----");
    }
    public static void main(String[] shivam){
       // String str = "sachin";

        String str = new String("sachin");
        //String str1 = new String("sachin");
        System.out.println(str==str);
    CompareStrings ob = new CompareStrings();

        ob.Print();


    }
}
