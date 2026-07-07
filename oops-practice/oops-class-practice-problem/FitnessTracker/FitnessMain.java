package oops_practice.oops_class_practice_problem.FitnessTracker;

public class FitnessMain {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice(3000, 120);
        device.sendAlert();
        device.generateReport();
        device.resetData();
        device.logActivity();

//        INotifiable noti = new FitnessDevice(23,45);
//        IReportable repo = new FitnessDevice(34,567);

        // create parent interface make reference of parent interface and object fitnessdevice


    }
}
