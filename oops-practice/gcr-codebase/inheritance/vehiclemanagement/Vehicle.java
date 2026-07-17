package oops_practice.gcrcodebase.inheritance.vehiclemanagement;

public class Vehicle {

    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}