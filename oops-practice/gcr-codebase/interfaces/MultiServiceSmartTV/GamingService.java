package oops_practice.gcrcodebase.interfaces.MultiServiceSmartTV;

public interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription : Active");
    }
}