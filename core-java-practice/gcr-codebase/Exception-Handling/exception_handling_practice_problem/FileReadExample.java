package corejava.gcrcodebase.exception_handling.exception_handling_practice_problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {

    public static void main(String[] args) {

        File file = new File("data.txt");

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}