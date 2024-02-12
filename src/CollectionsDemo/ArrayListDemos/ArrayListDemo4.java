package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // empty - true

        al.add("amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Kiran");

        System.out.println(al.isEmpty()); // not empty - false
        System.out.println("al="+al);
        al.clear();
        System.out.println("al="+al);

        System.out.println(al.isEmpty()); // empty - true


    }
}
