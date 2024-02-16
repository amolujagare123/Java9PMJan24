package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("capaity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 0

        v.add("amol");
        v.add("Aarav");
        v.add("Aditi");
        v.add("Arjun");
        v.add("Divya");
        v.add("Kiran");
        v.add("Aditi");
      /*  v.add("Arjun");
        v.add("Divya");
        v.add("Kiran");
        v.add("Kiran");
        v.add("Aditi");
        v.add("Arjun");
        v.add("Divya");
        v.add("Kiran");
        v.add("Aditi");
        v.add("Arjun");
        v.add("Divya");
        v.add("Kiran");
        v.add("Kiran");
        v.add("Kiran");*/

        System.out.println("capaity="+v.capacity()); // 20
        System.out.println("size="+v.size()); // 21

       /* Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());*/


        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
