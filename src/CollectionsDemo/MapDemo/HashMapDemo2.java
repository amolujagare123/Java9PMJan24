package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        // Homogeneous Records
        hm.put(101, "Amol");
        hm.put(102, "Sneha");
        hm.put(103, "Rahul");
        hm.put(104, "Priya");
        hm.put(105, "Ananya");
        hm.put(105, "demo");
        hm.put(106, "demo");
        hm.put(107, "demo");
        hm.put(null, "NullDemo1");
        hm.put(null, "NullDemo2");
        hm.put(115, null);
        hm.put(126, null);
        hm.put(135, null);
        hm.put(146, null);


        System.out.println(hm);

    }
}
