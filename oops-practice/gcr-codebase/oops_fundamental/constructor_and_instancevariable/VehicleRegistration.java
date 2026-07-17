package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;
public class VehicleRegistration {

    String ownerName;
    String vehicleType;

    static double registrationFee = 1000;

    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        VehicleRegistration vehicle1 = new VehicleRegistration("Shivam", "Car");

        VehicleRegistration vehicle2 = new VehicleRegistration("Rahul", "Bike");

        System.out.println("Before Updating Registration Fee");

        vehicle1.displayVehicleDetails();

        System.out.println();

        vehicle2.displayVehicleDetails();

        System.out.println();

        VehicleRegistration.updateRegistrationFee(1500);

        System.out.println("After Updating Registration Fee");

        vehicle1.displayVehicleDetails();

        System.out.println();

        vehicle2.displayVehicleDetails();
    }
}