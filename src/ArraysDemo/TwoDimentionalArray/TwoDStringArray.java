package ArraysDemo.TwoDimentionalArray;

public class TwoDStringArray {

    public static void main(String[] args) {

        String[][] strArr = new String[4][5];

        // Adding data to the array index-wise
        strArr[0][0] = "Amit";
        strArr[0][1] = "Priya";
        strArr[0][2] = "Rahul";
        strArr[0][3] = "Anita";
        strArr[0][4] = "Suresh";

        strArr[1][0] = "Kavita";
        strArr[1][1] = "Rajat";
        strArr[1][2] = "Simran";
        strArr[1][3] = "Deepak";
        strArr[1][4] = "Pooja";

        strArr[2][0] = "Vikas";
        strArr[2][1] = "Seema";
        strArr[2][2] = "Alok";
        strArr[2][3] = "Neha";
        strArr[2][4] = "Arjun";

        strArr[3][0] = "Anjali";
        strArr[3][1] = "Ravi";
        strArr[3][2] = "Sneha";
        strArr[3][3] = "Sunil";
        strArr[3][4] = "Kiran";




        int row = strArr.length;
        int col = strArr[0].length;

        System.out.println("row="+row+" col="+col);

        for (int i=0;i<strArr.length;i++)
        {
            for (int j = 0 ; j<strArr[0].length;j++)
            {
                System.out.print(strArr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
