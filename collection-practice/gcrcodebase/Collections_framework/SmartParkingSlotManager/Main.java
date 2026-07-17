package Collection_practice.gcrcodebase.Collections_framework.SmartParkingSlotManager;

public class Main {

    public static void main(String[] args) {

        ParkingManager parking = new ParkingManager();

        parking.addVehicle("UP32AB1234");
        parking.addVehicle("DL10CD5678");
        parking.addVehicle("MP09EF9876");

        System.out.println();

        parking.searchVehicle("DL10CD5678");

        System.out.println();

        parking.removeVehicle("UP32AB1234");

        System.out.println();

        parking.displayVehicles();
    }
}