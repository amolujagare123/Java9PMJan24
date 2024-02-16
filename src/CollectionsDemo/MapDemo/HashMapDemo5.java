package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo5 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Amol");
        hm.put(102, "Sneha");
        hm.put(103, "Rahul");
        hm.put(104, "Priya");
        hm.put(105, "Ananya");

        System.out.println("hm=" + hm);

        Set s = hm.keySet();

        Collection values = hm.values();

        System.out.println("Key Set = "+s);
        System.out.println("values = "+values);

         Set entrySet = hm.entrySet();
        System.out.println("entrySet = "+entrySet);
    }
}
