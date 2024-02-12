package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemove1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(34);
        al.add(14);
        al.add(32);
        al.add(54);
        al.add(36);
        al.add(74);

        System.out.println("al="+al);

     //   al.remove(2);

        Integer element = 36 ;
        al.remove(element);

        System.out.println("al="+al);

    }
}
