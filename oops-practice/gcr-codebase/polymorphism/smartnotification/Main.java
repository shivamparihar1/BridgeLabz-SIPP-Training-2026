package oops_practice.gcrcodebase.polymorphism.smartnotification;

public class Main {

    public static void main(String[] args) {

        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification(
                "Shivam",
                "Welcome to our service"
        );

        notifications[1] = new SMSNotification(
                "Rahul",
                "Your OTP is 1234"
        );

        notifications[2] = new PushNotification(
                "Amit",
                "Your order has been shipped"
        );


        System.out.println("Sent Notifications");
        System.out.println("------------------");

        for (Notification notification : notifications) {
            notification.sendNotification();
            System.out.println();
        }
    }
}