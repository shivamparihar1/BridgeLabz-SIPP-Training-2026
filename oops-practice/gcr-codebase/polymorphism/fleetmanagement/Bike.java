package oops_practice.gcrcodebase.polymorphism.fleetmanagement;

public class Bike extends Vehicle {

    double fuelRate = 2;

    public Bike(String model) {
        super(model);
    }

    public double fuelCost(int km) {
        return km * fuelRate;
    }
}