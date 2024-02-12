package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amol");
        al.add("Aarav");
        al.add("Aditi");
        al.add("Arjun");
        al.add("Divya");
        al.add("Kiran");

        System.out.println("al="+al);

        // remove all the elements that starts with 'A'
        // String str = "Amol" ;
        // str.charAt(0) == 'A'

        al.removeIf(str -> (str.charAt(0) == 'A') );

        System.out.println("al="+al);






    }
}
