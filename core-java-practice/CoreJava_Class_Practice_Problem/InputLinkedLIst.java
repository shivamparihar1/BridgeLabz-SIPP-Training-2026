package corejava.class_practice_problem;

public class InputLinkedLIst {

    static class Node{
        int Data;
        Node next;
        Node(int Data){
            this.Data = Data;
        }
    }
    public static void main(String [] args){
        Node a = new Node(10);

        Node b = new Node(20);

        Node c = new Node(30);

        Node d = new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;
       Node temp = a;
//       for(int i = 0; i < 4; i++){
//           System.out.println(temp.Data+" ");
//           temp=temp.next;
//       }


        while(temp!=null){
            System.out.println(temp.Data);
            temp = temp.next;
        }
    }
}
