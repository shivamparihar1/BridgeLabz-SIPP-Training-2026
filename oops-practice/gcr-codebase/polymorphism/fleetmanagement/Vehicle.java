package oops_practice.gcrcodebase.polymorphism.fleetmanagement;

public abstract class Vehicle {

    String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract double fuelCost(int km);

    public void displayModel() {
        System.out.println("Model: " + model);
    }
}