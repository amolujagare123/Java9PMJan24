package CollectionsDemo.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("Aarav");
        ll.add("Aditi");
        ll.add("Arjun");
        ll.add("Divya");
        ll.add("Kiran");

        System.out.println(ll);

           ll.addFirst("First");
           ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);


    }
}
