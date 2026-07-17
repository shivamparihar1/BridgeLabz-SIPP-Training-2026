package oops_practice.gcrcodebase.polymorphism.smartnotification;

public class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    public void sendNotification() {
        System.out.println("Push Notification");
        System.out.println("To: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("Sent through Push Notification");
    }
}