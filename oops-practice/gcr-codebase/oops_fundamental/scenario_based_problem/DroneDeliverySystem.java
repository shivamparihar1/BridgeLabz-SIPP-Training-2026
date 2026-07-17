package oops_practice.gcrcodebase.oops_fundamental.scenario_based_problem;

public class DroneDeliverySystem {

    int droneId;
    double batteryPercentage;

    static String companyName = "Sky Logistics";

    DroneDeliverySystem(int droneId, double batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        if (batteryPercentage >= 20) {
            batteryPercentage -= 10;
            System.out.println("Drone " + droneId + " started delivery.");
        } else {
            System.out.println("Drone " + droneId + " cannot start delivery. Low battery.");
        }
    }

    void displayStatus() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
    }

    public static void main(String[] args) {

        DroneDeliverySystem drone1 = new DroneDeliverySystem(101, 80);

        DroneDeliverySystem drone2 = new DroneDeliverySystem(102, 50);

        DroneDeliverySystem drone3 = new DroneDeliverySystem(103, 15);

        drone1.startDelivery();
        drone2.startDelivery();
        drone3.startDelivery();

        System.out.println();

        drone1.displayStatus();

        System.out.println();

        drone2.displayStatus();

        System.out.println();

        drone3.displayStatus();
    }
}