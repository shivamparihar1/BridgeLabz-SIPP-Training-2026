package oops_practice.gcrcodebase.inheritance.vehiclemanagement;

public class Main {

    public static void main(String[] args) {

        ElectricVehicle electricVehicle =
                new ElectricVehicle(
                        "Tesla Model 3",
                        250,
                        75
                );

        PetrolVehicle petrolVehicle =
                new PetrolVehicle(
                        "Toyota Fortuner",
                        180,
                        80
                );


        System.out.println("Electric Vehicle Details");
        electricVehicle.displayDetails();
        electricVehicle.charge();

        System.out.println();

        System.out.println("Petrol Vehicle Details");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}