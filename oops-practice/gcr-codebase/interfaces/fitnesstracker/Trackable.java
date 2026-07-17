package oops_practice.gcrcodebase.interfaces.fitnesstracker;
public interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data reset successfully.");
    }
}