package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Kiran");

        System.out.println("al="+al);

        al.remove(2);
        al.remove("Divya");
        System.out.println("al="+al);

    }
}
