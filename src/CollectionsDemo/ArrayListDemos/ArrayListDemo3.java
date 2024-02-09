package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Kiran");

        System.out.println("size="+al.size());
        System.out.println(al.get(3));

        System.out.println(al);

        System.out.println("---> printed using for loop >>");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("---> printed using for each loop >>");

        for(String str:al)
            System.out.println(str);

        System.out.println("---> printed using for Iterator >>");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
