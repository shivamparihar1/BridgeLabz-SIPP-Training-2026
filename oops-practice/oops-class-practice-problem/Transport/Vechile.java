package oops_practice.oops_class_practice_problem.Transport;

public abstract class Vechile {
    protected String VechileNumber;

    public Vechile(String vechileNumber) {
        VechileNumber = vechileNumber;
    }

    public abstract double fuelCost(double km);
}
