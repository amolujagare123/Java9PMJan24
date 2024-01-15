package ArraysDemo.TwoDimentionalArray;

public class TwoDStringArrayAnotherMethod {

    public static void main(String[] args) {

        String[][] strArr = {
                {"Amit", "Priya", "Rahul", "Anita", "Suresh"},
                {"Kavita", "Rajat", "Simran", "Deepak", "Pooja"},
                {"Vikas", "Seema", "Alok", "Neha", "Arjun"},
                {"Anjali", "Ravi", "Sneha", "Sunil", "Kiran"}
        };





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
