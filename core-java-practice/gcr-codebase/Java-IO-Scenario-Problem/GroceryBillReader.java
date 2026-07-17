package corejava.gcrcodebase.java_io_scenario_problem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GroceryBillReader {

    public static void main(String[] args) {

        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("bill.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                lineCount++;
            }

            System.out.println("Total number of lines = " + lineCount);

        } catch (IOException e) {

            System.out.println("Error reading file");
        }
    }
}