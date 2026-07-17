package oops_practice.oops_class_practice_problem.FitnessTracker;

public interface ITrackable {
    void logActivity();

    default void resetData(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("YOUR DATA HAS BEEN RESET");
        System.out.println("----------------------------------------------------------------------");
    }
}
