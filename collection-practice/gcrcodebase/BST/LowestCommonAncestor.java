package collections_practice_and_dsa_practice.gcrcodebase.BST;
public class LowestCommonAncestor {


    static class Node {

        int val;
        Node left;
        Node right;


        Node(int val){
            this.val = val;
        }
    }



    public static Node lowestCommonAncestor(Node root,int p,int q) {


        Node current = root;


        while(current != null) {


            if(p < current.val && q < current.val) {

                current = current.left;
            }


            else if(p > current.val && q > current.val) {

                current = current.right;
            }


            else {

                return current;
            }
        }


        return null;
    }
}
