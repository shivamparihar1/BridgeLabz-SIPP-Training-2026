package oops_practice.gcrcodebase.polymorphism.fleetmanagement;

public class Bus extends Vehicle {

    double fuelRate = 10;

    public Bus(String model) {
        super(model);
    }

    public double fuelCost(int km) {
        return km * fuelRate;
    }
}