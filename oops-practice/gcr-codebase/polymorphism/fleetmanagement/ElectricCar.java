package oops_practice.gcrcodebase.polymorphism.fleetmanagement;
public class ElectricCar extends Vehicle {

    double chargingRate = 1.5;

    public ElectricCar(String model) {
        super(model);
    }

    public double fuelCost(int km) {
        return km * chargingRate;
    }
}