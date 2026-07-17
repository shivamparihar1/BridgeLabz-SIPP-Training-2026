package oops_practice.gcrcodebase.interfaces.fitnesstracker;

public class FitnessDevice implements Trackable, Reportable, Notifiable {

    String deviceName;
    int steps;
    double calories;

    public FitnessDevice(String deviceName, int steps, double calories) {
        this.deviceName = deviceName;
        this.steps = steps;
        this.calories = calories;
    }

    public void logActivity() {
        System.out.println(deviceName + " logged activity.");
        System.out.println("Steps: " + steps);
        System.out.println("Calories Burned: " + calories);
    }

    public void generateReport() {
        System.out.println("Generating Fitness Report...");
        System.out.println("Device: " + deviceName);
        System.out.println("Total Steps: " + steps);
        System.out.println("Calories: " + calories);
    }

    public void sendAlert() {
        System.out.println("Alert: Time to complete your daily fitness goal.");
    }
}