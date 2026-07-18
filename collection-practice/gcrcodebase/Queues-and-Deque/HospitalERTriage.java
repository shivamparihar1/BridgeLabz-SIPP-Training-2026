package collections_practice_and_dsa_practice.gcrcodebase.Queues_and_Deque;
import java.util.*;

public class HospitalERTriage {


    static class Patient {

        int priority;
        String name;


        Patient(int priority, String name) {

            this.priority = priority;
            this.name = name;
        }
    }


    private PriorityQueue<Patient> triageQueue;


    public HospitalERTriage() {

        triageQueue = new PriorityQueue<>(
                (a, b) -> a.priority - b.priority
        );
    }



    public void admitPatient(Patient patient) {

        triageQueue.offer(patient);
    }



    public Patient callNextPatient() {

        if (triageQueue.isEmpty()) {

            throw new RuntimeException("No patients waiting");
        }

        return triageQueue.poll();
    }



    public Patient peekNextPatient() {

        if (triageQueue.isEmpty()) {

            throw new RuntimeException("No patients waiting");
        }

        return triageQueue.peek();
    }



    public static void main(String[] args) {


        HospitalERTriage er = new HospitalERTriage();


        er.admitPatient(new Patient(5, "John"));
        er.admitPatient(new Patient(2, "Alex"));
        er.admitPatient(new Patient(1, "David"));
        er.admitPatient(new Patient(4, "Emma"));


        Patient next;


        next = er.callNextPatient();
        System.out.println(next.name + " Priority: " + next.priority);


        next = er.callNextPatient();
        System.out.println(next.name + " Priority: " + next.priority);


        next = er.callNextPatient();
        System.out.println(next.name + " Priority: " + next.priority);


        next = er.callNextPatient();
        System.out.println(next.name + " Priority: " + next.priority);
    }
}