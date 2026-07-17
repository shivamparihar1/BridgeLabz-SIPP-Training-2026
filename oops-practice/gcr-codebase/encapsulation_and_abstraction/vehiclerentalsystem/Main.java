package oops_practice.gcrcodebase.encapsulation_and_abstraction.vehiclerentalsystem;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("CAR101", "Car", 2000);

        Bike bike = new Bike("BIKE102", "Bike", 800);

        Truck truck = new Truck("TRUCK103", "Truck", 5000, 3000);

        int days = 5;

        System.out.println("Car Details");
        System.out.println("Vehicle Number: " + car.getVehicleNumber());
        System.out.println("Vehicle Type: " + car.getVehicleType());
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("Bike Details");
        System.out.println("Vehicle Number: " + bike.getVehicleNumber());
        System.out.println("Vehicle Type: " + bike.getVehicleType());
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("Truck Details");
        System.out.println("Vehicle Number: " + truck.getVehicleNumber());
        System.out.println("Vehicle Type: " + truck.getVehicleType());
        System.out.println("Rental Cost: " + truck.calculateRentalCost(days));
    }
}