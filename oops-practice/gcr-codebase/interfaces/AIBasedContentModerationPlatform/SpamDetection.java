package oops_practice.gcrcodebase.interfaces.AIBasedContentModerationPlatform;
public interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam posts are not allowed.");
    }
}
