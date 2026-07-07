package oops_practice.oops_class_practice_problem.FitnessTracker;

public class FitnessDevice implements ITrackable, IReportable, INotifiable{
    int steps;
    int calories;

    public FitnessDevice(int steps, int calories){
        this.steps = steps;
        this.calories = calories;
    }
//
//    public FitnessDevice() {
//
//    }

    @Override
    public void logActivity() {
        System.out.println("_________________________________________________");
        System.out.println("Activity is logged");
        System.out.println("Steps:-"+steps);
        System.out.println("Calories Burned:-"+calories);
        System.out.println("__________________________________________________");
    }
    @Override
    public void  generateReport(){
        System.out.println("___________________________________________________");
        System.out.println("FITNESS REPORT");
        System.out.println("____________________________________________________");
        System.out.println("Total Steps:- "+steps);
        System.out.println("Calories Burned:- " +calories);
        System.out.println("____________________________________________________");

    }
    @Override
    public void sendAlert(){
        int remainingSteps = 5000 - steps;
        if(steps<5000){
            System.out.println("You Need to walk more "+remainingSteps+" ");
        }
        else{
            System.out.println("You are fit and fine");

        }
    }
}
