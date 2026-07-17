package corejava.gcrcodebase.strings.level3;

import java.util.Scanner;

public class BMICalculatorForTeam {

    public static String[] calculateBMIAndStatus(double weight, double heightCm) {

        double heightMeter = heightCm / 100.0;
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] generateBMIReport(double[][] data) {

        String[][] report = new String[10][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight);
            report[i][2] = bmiResult[0];
            report[i][3] = bmiResult[1];
        }

        return report;
    }

    public static void displayReport(String[][] report) {

        System.out.println();
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                            report[i][1] + "\t\t" +
                            report[i][2] + "\t\t" +
                            report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] report = generateBMIReport(data);

        displayReport(report);

        sc.close();
    }
}