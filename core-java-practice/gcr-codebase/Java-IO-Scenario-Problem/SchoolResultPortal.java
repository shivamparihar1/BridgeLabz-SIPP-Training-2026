package corejava.gcrcodebase.java_io_scenario_problem;

import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {

    public static void main(String[] args) {

        File inputFile = new File("students.txt");
        File outputFile = new File("report_card.txt");

        try (Scanner sc = new Scanner(inputFile);
             FileWriter fw = new FileWriter(outputFile, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            while (sc.hasNext()) {

                String name = sc.next();
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();

                int total = m1 + m2 + m3;
                double avg = total / 3.0;

                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Average: " + avg);
                bw.newLine();
                bw.write("------------------------");
                bw.newLine();
            }

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found");
        } catch (IOException e) {
            System.out.println("Error writing report card");
        }
    }
}
