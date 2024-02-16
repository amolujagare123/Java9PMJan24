package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm.isEmpty()); // true
        // Homogeneous Records
        hm.put(101, "Amol");
        hm.put(102, "Sneha");
        hm.put(103, "Rahul");
        hm.put(104, "Priya");
        hm.put(105, "Ananya");
        System.out.println(hm.isEmpty()); // false
        System.out.println("hm="+hm);

        System.out.println("size="+hm.size());

        System.out.println(hm.get(102));

        hm.remove(104);
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(104));

        System.out.println(hm.containsValue("Rahul"));

        System.out.println("size="+hm.size());

        hm.clear();
        System.out.println(hm);
    }
}
