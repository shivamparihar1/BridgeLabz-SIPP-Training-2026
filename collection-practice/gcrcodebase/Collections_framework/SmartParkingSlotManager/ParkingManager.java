package Collection_practice.gcrcodebase.Collections_framework.SmartParkingSlotManager;

import java.util.ArrayList;

public class ParkingManager {

    ArrayList<String> parkedVehicles = new ArrayList<>();

    // Add Vehicle
    public void addVehicle(String vehicleNumber) {

        parkedVehicles.add(vehicleNumber);
        System.out.println(vehicleNumber + " Entered Parking.");
    }

    // Remove Vehicle
    public void removeVehicle(String vehicleNumber) {

        if (parkedVehicles.remove(vehicleNumber)) {
            System.out.println(vehicleNumber + " Exited Parking.");
        } else {
            System.out.println(vehicleNumber + " Not Found.");
        }
    }

    // Search Vehicle
    public void searchVehicle(String vehicleNumber) {

        if (parkedVehicles.contains(vehicleNumber)) {
            System.out.println(vehicleNumber + " is Currently Parked.");
        } else {
            System.out.println(vehicleNumber + " is Not Parked.");
        }
    }

    // Display All Vehicles
    public void displayVehicles() {

        System.out.println("Parked Vehicles:");

        for (String vehicle : parkedVehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Total Occupied Parking Slots : " + parkedVehicles.size());
    }
}