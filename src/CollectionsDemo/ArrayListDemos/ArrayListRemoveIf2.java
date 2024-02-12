package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Rekha");
        al.add("Kiran");
        al.add("Amit");


        System.out.println("al="+al);

        // remove all the elements whose length is less than 5
        // String str = "Amol" ;
        //  str.length() < 5

        al.removeIf(str -> (str.length() < 5) );

        System.out.println("al="+al);






    }
}
