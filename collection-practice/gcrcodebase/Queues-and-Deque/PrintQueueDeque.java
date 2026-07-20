package collections_practice_and_dsa_practice.gcrcodebase.Queues_and_Deque;
import java.util.*;

public class PrintQueueDeque {


    private Deque<Integer> printQueue;


    public PrintQueueDeque() {

        printQueue = new ArrayDeque<>();
    }



    public void submitJob(int jobId) {

        printQueue.addLast(jobId);
    }



    public void submitUrgentJob(int jobId) {

        printQueue.addFirst(jobId);
    }



    public int printNextJob() {

        if (printQueue.isEmpty()) {

            throw new RuntimeException("No jobs in queue");
        }

        return printQueue.removeFirst();
    }



    public boolean isEmpty() {

        return printQueue.isEmpty();
    }



    public static void main(String[] args) {


        PrintQueueDeque queue = new PrintQueueDeque();


        queue.submitJob(101);
        queue.submitJob(102);

        queue.submitUrgentJob(999);

        queue.submitJob(103);


        System.out.println("Printing Job: " + queue.printNextJob());

        System.out.println("Printing Job: " + queue.printNextJob());

        System.out.println("Printing Job: " + queue.printNextJob());

        System.out.println("Printing Job: " + queue.printNextJob());
    }
}
