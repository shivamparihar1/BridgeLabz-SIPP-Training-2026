package collections_practice_and_dsa_practice.gcrcodebase.linked_list;

public class InsertTrackPlaylist {


    static class Node {

        int trackId;
        Node next;


        Node(int trackId) {
            this.trackId = trackId;
            this.next = null;
        }
    }


    public static void insertAfter(Node current, int trackId) {

        Node newNode = new Node(trackId);

        newNode.next = current.next;

        current.next = newNode;
    }



    public static void printPlaylist(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.trackId + " ");

            temp = temp.next;
        }
    }



    public static void main(String[] args) {


        Node first = new Node(101);
        Node second = new Node(102);
        Node third = new Node(103);


        first.next = second;
        second.next = third;


        insertAfter(second, 104);


        System.out.println("Updated Playlist:");

        printPlaylist(first);
    }
}