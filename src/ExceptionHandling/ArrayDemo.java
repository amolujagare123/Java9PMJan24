package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[0] = 12;
            a[1] = 13;
            a[2] = 14;
            a[3] = 52;
            a[4] = 62;
            a[5] = 72;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
