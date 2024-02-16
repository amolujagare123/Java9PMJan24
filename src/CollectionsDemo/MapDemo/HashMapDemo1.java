package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        // Homogeneous Records
        hm.put(101, "Amol");
        hm.put(102, "Sneha");
        hm.put(103, "Rahul");
        hm.put(104, "Priya");
        hm.put(105, "Ananya");

        // Heterogeneous Records
        hm.put(201, "John Doe");
        hm.put("KeyString", 3.14);
        hm.put(3.14, true);
        hm.put(true, 'h');
        hm.put("ObjectKey", true);

        System.out.println(hm);

    }
}
