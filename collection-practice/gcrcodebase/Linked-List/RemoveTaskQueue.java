package collections_practice_and_dsa_practice.gcrcodebase.linked_list;
public class RemoveTaskQueue {


    static class Node {

        int taskId;
        Node next;


        Node(int taskId) {
            this.taskId = taskId;
            this.next = null;
        }
    }



    public static Node removeTask(Node head, int taskId) {


        if (head == null) {
            return null;
        }


        if (head.taskId == taskId) {
            return head.next;
        }


        Node prev = head;
        Node curr = head.next;


        while (curr != null && curr.taskId != taskId) {

            prev = curr;
            curr = curr.next;
        }


        if (curr != null) {

            prev.next = curr.next;
        }


        return head;
    }



    public static void printQueue(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.taskId + " ");

            temp = temp.next;
        }
    }



    public static void main(String[] args) {


        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);


        int completedTask = 103;


        head = removeTask(head, completedTask);


        System.out.println("Updated Task Queue:");

        printQueue(head);
    }
}