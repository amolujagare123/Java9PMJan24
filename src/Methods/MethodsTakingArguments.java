package Methods;

import basics.ClassPack.BookPublication;

public class MethodsTakingArguments {

    void myMethod1()
    {
        System.out.println("this is my Method");
    }

    void myMethod2(int a)
    {
        System.out.println("a="+a);
        System.out.println("this is my Method");
    }
    void myMethod3(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void myMethod4(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void myMethod5(int a,double b,char c,String str)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("str="+str);

    }

    void printMyArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    void printMy2DArray(String[][] stArr) {
        System.out.println("\n===== > Below is my 2-D Array");

        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void bookDetailsAfterProfit(BookPublication obj)
    {
        obj.calculateTotalProfit();
        System.out.println("Profit Printed --> "+obj.totalProfit);
    }
    public static void main(String[] args) {
        MethodsTakingArguments ob = new MethodsTakingArguments();
       /* ob.myMethod1();
        ob.myMethod2(45);
        ob.myMethod3(34,56);
        ob.myMethod4(34,56,90);
        ob.myMethod5(34,5.6,'k',"amol");


        int[] xrr = {12,45,67,88,90,11};
        System.out.println("\n===== > Below is my Array");
        ob.printMyArray(xrr);

        String[][] myTwoDArray = {
                {"Aarav", "Akshay", "Ananya", "Amit", "Aditi"},
                {"Bhavya", "Bhaskar", "Bhoomi", "Bharat", "Bhagya"},
                {"Chetan", "Chitra", "Chirag", "Charul", "Chanchal"},
                {"Deepak", "Divya", "Dhruv", "Disha", "Darshan"}
        };

        ob.printMy2DArray(myTwoDArray);
        */
        BookPublication bookPublication = new BookPublication();
        bookPublication.bookName ="Software Testing";
        bookPublication.publicationName ="TechMax";
        bookPublication.price = 300;
        bookPublication.displayDetails();

        ob.bookDetailsAfterProfit(bookPublication);


    }
}
