package oops_practice.gcrcodebase.interfaces.fitnesstracker;

public class Main {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice(
                "Smart Watch",
                8000,
                450
        );

        device.logActivity();

        System.out.println();

        device.generateReport();

        System.out.println();

        device.sendAlert();

        System.out.println();

        device.resetData();
    }
}