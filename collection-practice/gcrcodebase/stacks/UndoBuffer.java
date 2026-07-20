package collections_practice_and_dsa_practice.gcrcodebase.stacks;

public class UndoBuffer {

    private String[] data;
    private int top;


    UndoBuffer(int maxDepth) {

        data = new String[maxDepth];
        top = -1;
    }


    public boolean push(String edit) {

        if (top == data.length - 1) {
            return false;
        }

        data[++top] = edit;

        return true;
    }


    public String pop() {

        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }

        return data[top--];
    }


    public String peek() {

        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }

        return data[top];
    }


    public boolean isEmpty() {

        return top == -1;
    }



    public static void main(String[] args) {


        UndoBuffer undo = new UndoBuffer(3);


        System.out.println(undo.push("Typed Hello"));
        System.out.println(undo.push("Added Image"));
        System.out.println(undo.push("Changed Font"));


        System.out.println("Latest edit: " + undo.peek());


        System.out.println("Undo: " + undo.pop());
        System.out.println("Undo: " + undo.pop());


        System.out.println("Latest edit: " + undo.peek());


        System.out.println(undo.push("Inserted Table"));
    }
}