package collections_practice_and_dsa_practice.gcrcodebase.Tree;

public class DeleteFolderTree {


    static class Node {

        String folderName;
        Node left;
        Node right;


        Node(String folderName) {

            this.folderName = folderName;
        }
    }



    public static void deleteFolderTree(Node node) {


        if (node == null) {

            return;
        }


        deleteFolderTree(node.left);


        deleteFolderTree(node.right);


        deleteNode(node);
    }



    public static void deleteNode(Node node) {

        System.out.println("Deleting folder: " + node.folderName);
    }



    public static void main(String[] args) {


        Node root = new Node("Root");

        root.left = new Node("Documents");

        root.right = new Node("Pictures");

        root.left.left = new Node("Resume");

        root.left.right = new Node("Projects");

        root.right.left = new Node("Photos");



        deleteFolderTree(root);
    }
}