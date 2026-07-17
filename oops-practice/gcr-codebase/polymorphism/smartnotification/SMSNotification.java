package oops_practice.gcrcodebase.polymorphism.smartnotification;
public class SMSNotification extends Notification {

    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    public void sendNotification() {
        System.out.println("SMS Notification");
        System.out.println("To: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("Sent through SMS");
    }
}