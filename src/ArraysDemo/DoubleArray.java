package ArraysDemo;

public class DoubleArray {

    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 11.22;
        d[1] = 23.45;
        d[2] = 34.56;
        d[3] = 45.67;
        d[4] = 90.22;

        for (int i=0;i<5;i++)
            System.out.println(d[i]);

        /*  for(int x: a)
            System.out.println(x);
            */

        for (double x: d)
            System.out.println(x);

    }
}
