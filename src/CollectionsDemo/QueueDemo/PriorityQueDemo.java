package CollectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Amol");
        pq.offer("Sneha");
        pq.offer("Rahul");
        pq.offer("Priya");
        pq.offer("Ananya");
        pq.offer("Vikram");
        pq.offer("Neha");
        pq.offer("Rajesh");
        pq.offer("Pooja");
        pq.offer("Amit");

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
