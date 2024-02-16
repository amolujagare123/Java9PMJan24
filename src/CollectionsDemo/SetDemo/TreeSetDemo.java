package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> lhs = new TreeSet<>();

        lhs.add("Divya");
        lhs.add("amol");
        lhs.add("Aarav");
        lhs.add("Aditi");
        lhs.add("Arjun");
        lhs.add("Kiran");
        lhs.add("Kiran");

        System.out.println(lhs);

    }
}
