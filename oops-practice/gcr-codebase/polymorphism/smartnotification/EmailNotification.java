package oops_practice.gcrcodebase.polymorphism.smartnotification;

public class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    public void sendNotification() {
        System.out.println("Email Notification");
        System.out.println("To: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("Sent through Email");
    }
}