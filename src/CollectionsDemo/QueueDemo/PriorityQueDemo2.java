package CollectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(45);
        pq.offer(15);
        pq.offer(46);
        pq.offer(25);
        pq.offer(99);

  // 15, 25, 45, 46, 99
        System.out.println(pq);

        System.out.println(pq.poll()); // 15
        System.out.println(pq.poll());// 25
        System.out.println(pq.poll());// 45
        System.out.println(pq.poll());// 46
        System.out.println(pq.poll());// 99
    }
}
