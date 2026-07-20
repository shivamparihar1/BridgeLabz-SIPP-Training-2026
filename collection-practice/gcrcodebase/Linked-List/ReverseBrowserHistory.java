package collections_practice_and_dsa_practice.gcrcodebase.linked_list;

public class ReverseBrowserHistory {


    static class Node {

        int pageId;
        Node next;


        Node(int pageId) {
            this.pageId = pageId;
            this.next = null;
        }
    }



    public static Node reverseHistory(Node head) {

        Node prev = null;
        Node curr = head;


        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }


        return prev;
    }



    public static void printHistory(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.pageId + " ");

            temp = temp.next;
        }
    }



    public static void main(String[] args) {


        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);


        head = reverseHistory(head);


        System.out.println("Reversed Browser History:");

        printHistory(head);
    }
}