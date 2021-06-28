package queue;

public class mainQueue {

    public static void main(String[] args) {
        Queue newQueue = new Queue(10);
        newQueue.Title();
        newQueue.enqueue(50);
        newQueue.show();
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        System.out.println("\nNama saya adalah Ihza Maulana Zakiya\n");

        newQueue.enqueue(70);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
    }
}
