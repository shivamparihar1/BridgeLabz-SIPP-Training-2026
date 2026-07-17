package oops_practice.oops_class_practice_problem.Transport;

public class Main {

    public static void main(String[] args) {

        double distance = 100;

        Vechile[] fleet = {
                new Bike("bike101"),
                new Car("car304"),
                new Bus("bus350")
        };

        for (Vechile v : fleet) {
            System.out.println("Cost for " + distance +
                    " km is " + v.fuelCost(distance));
        }
    }
}