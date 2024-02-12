package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Kiran");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Aarav");
        al2.add("Sanya");
        al2.add("Rohan");
        al2.add("Aditi");
        al2.add("Vikram");
        al2.add("Kavya");
        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);




    }
}
