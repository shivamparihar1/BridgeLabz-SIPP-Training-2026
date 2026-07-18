package collections_practice_and_dsa_practice.gcrcodebase.Queues_and_Deque;
public class PacketBuffer {

    private int[] data;
    private int front;
    private int count;


    PacketBuffer(int capacity) {

        data = new int[capacity];

        front = 0;
        count = 0;
    }


    public boolean enqueue(int packetId) {

        if (count == data.length) {
            return false;
        }

        data[(front + count) % data.length] = packetId;

        count++;

        return true;
    }


    public int dequeue() {

        if (count == 0) {
            throw new RuntimeException("Buffer empty");
        }

        int val = data[front];

        front = (front + 1) % data.length;

        count--;

        return val;
    }


    public boolean isEmpty() {

        return count == 0;
    }


    public boolean isFull() {

        return count == data.length;
    }



    public static void main(String[] args) {


        PacketBuffer buffer = new PacketBuffer(3);


        System.out.println(buffer.enqueue(101));
        System.out.println(buffer.enqueue(102));
        System.out.println(buffer.enqueue(103));


        System.out.println(buffer.enqueue(104));


        System.out.println("Processed Packet: " + buffer.dequeue());

        System.out.println(buffer.enqueue(104));


        System.out.println("Processed Packet: " + buffer.dequeue());
        System.out.println("Processed Packet: " + buffer.dequeue());
        System.out.println("Processed Packet: " + buffer.dequeue());
    }
}