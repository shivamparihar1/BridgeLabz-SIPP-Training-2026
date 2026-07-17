package Collection_practice.gcrcodebase.Collections_framework.EventEntryVerificationSystem;

import java.util.HashSet;

public class EventManager {

    HashSet<String> participants = new HashSet<>();

    // Register Participant
    public void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " Registered Successfully.");
        } else {
            System.out.println(email + " Already Registered.");
        }
    }

    // Display Participants
    public void displayParticipants() {

        System.out.println("Registered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Eligible Attendees : " + participants.size());
    }
}