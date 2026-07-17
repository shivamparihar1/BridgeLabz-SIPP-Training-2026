package oops_practice.gcrcodebase.inheritance.vehiclemanagement;

public class ElectricVehicle extends Vehicle {

    int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}