package oops_practice.gcrcodebase.encapsulation_and_abstraction.vehiclerentalsystem;

public class Car extends Vehicle {

    private double dailyRate;

    public Car(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}