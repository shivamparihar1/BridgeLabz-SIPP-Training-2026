package oops_practice.oops_class_practice_problem.Transport;

public class Bus extends Vechile {

    public Bus(String vechileNumber) {
        super(vechileNumber);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}