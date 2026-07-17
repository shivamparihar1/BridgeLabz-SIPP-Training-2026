package oops_practice.gcrcodebase.interfaces.MultiServiceSmartTV;

public interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription : Active");
    }
}