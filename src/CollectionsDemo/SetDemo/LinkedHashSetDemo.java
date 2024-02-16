package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amol");
        lhs.add("Aarav");
        lhs.add("Aditi");
        lhs.add("Arjun");
        lhs.add("Divya");
        lhs.add("Kiran");
        lhs.add("Kiran");

        System.out.println(lhs);

    }
}
