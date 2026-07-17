package oops_practice.gcrcodebase.inheritance.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable {

    double fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " Liters");
    }
}