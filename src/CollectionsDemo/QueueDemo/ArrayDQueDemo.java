package CollectionsDemo.QueueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDQueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.offer("Amol");
        adq.offer("Sneha");
        adq.offer("Rahul");
        adq.offer("Priya");
        adq.offer("Ananya");
        adq.offer("Vikram");
        adq.offer("Neha");
        adq.offer("Rajesh");
        adq.offer("Pooja");
        adq.offer("Amit");

        System.out.println(adq);

        adq.offerFirst("First");
        adq.offerLast("Last");

        System.out.println(adq);

        adq.removeFirst();
        adq.removeLast();

        System.out.println(adq);
    }
}
