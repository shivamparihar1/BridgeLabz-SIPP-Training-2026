package oops_practice.gcrcodebase.polymorphism.smartnotification;

public class Notification {

    String recipientName;
    String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending notification...");
    }
}
