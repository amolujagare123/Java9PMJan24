package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Kiran");
        al.add(10);
        al.add(13.56);
        al.add('d');
        al.add(true);

        System.out.println(al);
    }
}
