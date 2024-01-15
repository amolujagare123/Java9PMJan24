package ArraysDemo.TwoDimentionalArray;

public class TwoDIntArrayAnotherMethod {

    public static void main(String[] args) {

        int[][] a = {

                {1,1,1,1,1},
                {2,2,2,2,2},
                {4,4,4,4,4},
                {5,5,5,5,5}
        };



        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row+" col="+col);

        for (int i=0;i<a.length;i++)
        {
            for (int j = 0 ; j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}
