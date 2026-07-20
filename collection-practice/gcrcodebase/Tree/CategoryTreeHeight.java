package collections_practice_and_dsa_practice.gcrcodebase.Tree;

public class CategoryTreeHeight {


    static class Node {

        int val;
        Node left;
        Node right;


        Node(int val) {

            this.val = val;
        }
    }



    public static int height(Node node) {


        if (node == null) {

            return -1;
        }


        return Math.max(height(node.left), height(node.right)) + 1;
    }



    public static boolean isTooDeep(Node root, int threshold) {


        return height(root) > threshold;
    }



    public static void main(String[] args) {


        Node root = new Node(1);

        root.left = new Node(2);

        root.left.left = new Node(3);

        root.left.left.left = new Node(4);



        int threshold = 2;


        int treeHeight = height(root);


        System.out.println("Tree Height: " + treeHeight);

        System.out.println("Exceeds Threshold: "
                + isTooDeep(root, threshold));
    }
}