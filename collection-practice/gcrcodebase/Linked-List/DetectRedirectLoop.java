package collections_practice_and_dsa_practice.gcrcodebase.linked_list;

public class DetectRedirectLoop {


    static class Node {

        int urlId;
        Node next;


        Node(int urlId) {
            this.urlId = urlId;
            this.next = null;
        }
    }



    public static boolean hasRedirectLoop(Node head) {


        Node slow = head;
        Node fast = head;


        while (fast != null && fast.next != null) {


            slow = slow.next;

            fast = fast.next.next;


            if (slow == fast) {
                return true;
            }
        }


        return false;
    }



    public static void main(String[] args) {


        Node url1 = new Node(101);
        Node url2 = new Node(102);
        Node url3 = new Node(103);
        Node url4 = new Node(104);


        url1.next = url2;
        url2.next = url3;
        url3.next = url4;


        url4.next = url2;


        boolean result = hasRedirectLoop(url1);


        System.out.println("Redirect loop exists: " + result);
    }
}