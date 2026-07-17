package oops_practice.gcrcodebase.polymorphism.fleetmanagement;
public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Car("Honda City");
        vehicles[1] = new Bus("Volvo Bus");
        vehicles[2] = new Bike("Yamaha R15");
        vehicles[3] = new ElectricCar("Tesla Model 3");

        int distance = 100;

        for (Vehicle vehicle : vehicles) {

            if (vehicle instanceof Car) {
                System.out.println("Car Fuel Cost: " + vehicle.fuelCost(distance));
            }

            else if (vehicle instanceof Bus) {
                System.out.println("Bus Fuel Cost: " + vehicle.fuelCost(distance));
            }

            else if (vehicle instanceof Bike) {
                System.out.println("Bike Fuel Cost: " + vehicle.fuelCost(distance));
            }

            else if (vehicle instanceof ElectricCar) {
                System.out.println("Electric Car Charging Cost: " + vehicle.fuelCost(distance));
            }
        }
    }
}
