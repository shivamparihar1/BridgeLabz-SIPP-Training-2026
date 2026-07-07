package corejava.class_practice_problem;
import java.io.FileReader;

public class FileInputOutput {

    public static void main(String[] args){
        try {
            FileReader file = new FileReader("Hello.txt");
            //file.read("Hii my name is Sahil");
            file.read();
            System.out.println("File read Successfully");
            file.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
