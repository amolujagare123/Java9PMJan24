package ArraysDemo;

public class IntArray {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 89;
        a[1] = 22;
        a[2] = 45;
        a[3] = 90;
        a[4] = 67;

        System.out.println("length="+a.length);

        /*for(int i=0;i<5;i++)
         System.out.println(a[i]);*/

        for(int var : a )
            System.out.println(var);


    }
}
