package ArraysDemo.anotherWay;

public class IntArray {

    public static void main(String[] args) {

        int[] a = {12,45,67,89,12,46,90};

      int l = a.length;
        System.out.println("length="+a.length);

        for(int i=0;i<a.length;i++)
         System.out.println(a[i]);

      /*  for(int var : a )
            System.out.println(var);*/


    }
}
