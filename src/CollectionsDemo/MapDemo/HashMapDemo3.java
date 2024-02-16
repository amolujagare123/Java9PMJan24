package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        // Homogeneous Records
        hm.put(101, "Amol");
        hm.put(102, "Sneha");
        hm.put(103, "Rahul");
        hm.put(104, "Priya");
        hm.put(105, "Ananya");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm2 = new HashMap<>();
        System.out.println("hm2="+hm2);

        hm2.putAll(hm);

        System.out.println("hm2="+hm2);


    }
}
