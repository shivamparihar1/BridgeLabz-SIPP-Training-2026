package collections_practice_and_dsa_practice.gcrcodebase.linked_list;
public class FindMiddleServer {


    static class Node {

        int serverId;
        Node next;


        Node(int serverId) {
            this.serverId = serverId;
            this.next = null;
        }
    }



    public static Node findMiddleServer(Node head) {


        Node slow = head;
        Node fast = head;


        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }


        return slow;
    }



    public static void main(String[] args) {


        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);
        head.next.next.next.next = new Node(105);


        Node middle = findMiddleServer(head);


        System.out.println("Middle server ID: " + middle.serverId);
    }
}