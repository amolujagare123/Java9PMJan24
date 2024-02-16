package CollectionsDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Amol");
        s.push("Aarav");
        s.push("Aditi");
        s.push("Arjun");
        s.push("Divya");
        s.push("Kiran");
        s.push("Aditi");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);




    }
}
