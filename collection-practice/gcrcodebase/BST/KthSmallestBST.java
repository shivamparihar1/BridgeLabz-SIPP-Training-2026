package collections_practice_and_dsa_practice.gcrcodebase.BST;

import java.util.*;

public class KthSmallestBST {


    static class Node {

        int val;
        Node left;
        Node right;


        Node(int val){
            this.val = val;
        }
    }



    public static int kthSmallest(Node root,int k) {


        Deque<Node> stack = new ArrayDeque<>();


        Node current = root;

        int count = 0;



        while(current != null || !stack.isEmpty()) {


            while(current != null) {

                stack.push(current);

                current = current.left;
            }


            current = stack.pop();


            count++;


            if(count == k)
                return current.val;


            current = current.right;
        }


        throw new IllegalArgumentException("k out of range");
    }
}