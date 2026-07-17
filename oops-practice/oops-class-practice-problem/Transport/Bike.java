package oops_practice.oops_class_practice_problem.Transport;

public class Bike extends Vechile{

    public Bike(String vechileNumber){
        super(vechileNumber);
    }
    @Override
    public double fuelCost(double km){
        return km*3;
    }
}
