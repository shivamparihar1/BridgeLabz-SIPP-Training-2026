package Collection_practice.gcrcodebase.Collections_framework.EventEntryVerificationSystem;

public class Main {

    public static void main(String[] args) {

        EventManager event = new EventManager();

        event.registerParticipant("shivam@gmail.com");
        event.registerParticipant("aman@gmail.com");
        event.registerParticipant("rohit@gmail.com");

        // Duplicate Registration
        event.registerParticipant("aman@gmail.com");

        System.out.println();

        event.displayParticipants();
    }
}