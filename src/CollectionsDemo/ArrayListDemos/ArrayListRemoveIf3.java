package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf3 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(344);
        al.add(145);
        al.add(323);
        al.add(547);
        al.add(361);
        al.add(744);


        System.out.println("al="+al);

        // remove all the elements which are odd numbers
        // int i = 10 ;
        //

        al.removeIf( i -> (i%2 != 0 ) );

        System.out.println("al="+al);






    }
}
