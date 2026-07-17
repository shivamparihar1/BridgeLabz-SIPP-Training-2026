package oops_practice.gcrcodebase.oops_fundamental.scenario_based_problem;

public class ElectricVehicleChargingNetwork {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    int stationId;
    double unitsConsumed;

    ElectricVehicleChargingNetwork(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Total Bill: " + calculateBill());
    }

    static void updateElectricityRate(double newRate) {
        electricityRate = newRate;
    }

    static void displayTotalStations() {
        System.out.println("Total Stations: " + totalStations);
    }

    public static void main(String[] args) {

        ElectricVehicleChargingNetwork station1 =
                new ElectricVehicleChargingNetwork(101, 50);

        ElectricVehicleChargingNetwork station2 =
                new ElectricVehicleChargingNetwork(102, 80);

        ElectricVehicleChargingNetwork station3 =
                new ElectricVehicleChargingNetwork(103, 120);

        ElectricVehicleChargingNetwork station4 =
                new ElectricVehicleChargingNetwork(104, 70);

        ElectricVehicleChargingNetwork station5 =
                new ElectricVehicleChargingNetwork(105, 100);

        System.out.println("Bills Before Rate Change");

        station1.displayStationDetails();
        System.out.println();

        station2.displayStationDetails();
        System.out.println();

        station3.displayStationDetails();
        System.out.println();

        station4.displayStationDetails();
        System.out.println();

        station5.displayStationDetails();

        System.out.println();

        ElectricVehicleChargingNetwork.updateElectricityRate(10);

        System.out.println("Bills After Rate Change");

        station1.displayStationDetails();
        System.out.println();

        station2.displayStationDetails();

        System.out.println();

        ElectricVehicleChargingNetwork.displayTotalStations();
    }
}