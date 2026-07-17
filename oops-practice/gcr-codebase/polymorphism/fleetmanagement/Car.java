package oops_practice.gcrcodebase.polymorphism.fleetmanagement;

public class Car extends Vehicle {

    double fuelRate = 5;

    public Car(String model) {
        super(model);
    }

    public double fuelCost(int km) {
        return km * fuelRate;
    }
}