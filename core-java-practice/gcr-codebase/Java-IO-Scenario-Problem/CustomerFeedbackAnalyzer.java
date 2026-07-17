package corejava.gcrcodebase.java_io_scenario_problem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomerFeedbackAnalyzer {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("feedback.txt"))) {

            String line;

            int linesRead = 0;

            while ((line = br.readLine()) != null && linesRead < 5) {

                System.out.println(line);

                String lower = line.toLowerCase();

                if (lower.contains("good")) {
                    count++;
                }

                linesRead++;
            }

            System.out.println("Good Feedback Count = " + count);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}