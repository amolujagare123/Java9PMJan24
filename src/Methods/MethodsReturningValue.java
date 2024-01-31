package Methods;

import basics.ClassPack.MyClassDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValue {

    int myMethod()
    {
        System.out.println("inside my method");
        System.out.println("this method returns int type of value");
        int x = 90;
      //  return 10 ;
        return x ;
    }

    Date convertStringToDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate = sd.parse(dateStr);

        return myDate;
    }

    String reverseString(String str)
    {
        String temp ="";

        for (int i=str.length()-1;i>=0;i--)
        {
            temp = temp + str.charAt(i);
        }

        return temp;
    }

    // generate array with random values

    int[] generateArray(int l)
    {
        // size =5
        int[] arr = new int[l];

        for (int i=0;i< arr.length;i++)
            arr[i] = (int) (Math.random() * 100);

        return arr;
    }

    String[][] reverseTwoDArrayOfString(String[][] myStringArray)
    {

        int row = myStringArray.length;
        int col = myStringArray[0].length;

        String[][] temp  = new String[row][col];

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                temp[i][j] = reverseString(myStringArray[i][j]);
            }
        }

        return temp;
    }

    MyClassDemo loadMyClassDemoObject()
    {
        MyClassDemo obj = new MyClassDemo();
        obj.a = 90;
        obj.d = 23.45;
        obj.c = 'g';
        obj.str = "Selenium";

        return obj;
    }



    public static void main(String[] args) throws ParseException {

        MethodsReturningValue ob = new MethodsReturningValue();

        int b;
        b = 70;
        System.out.println(b);
        int d = b;

        System.out.println("ob.myMethod() -> "+ob.myMethod());

        int y = ob.myMethod() ;
        System.out.println("y="+y);

        Date convertedDate = ob.convertStringToDate("12/07/1967");

        System.out.println("convertedDate="+convertedDate);

        String myString  = "Sanjeev";

        String revString = ob.reverseString(myString);

        System.out.println("revString="+revString);


        int[] myArr = ob.generateArray(10);

        for (int i=0;i<myArr.length;i++)
            System.out.print(myArr[i]+" ");


        String[][] stArr = {
                {"Ravi", "Priya", "Amit"},
                {"Sneha", "Vikram", "Anita"},
                {"Arjun", "Kavita", "Raj"},
                {"Pooja", "Rahul", "Meera"}
        };

        System.out.println();
        // print above array with each string reversed

        String[][] reverStArr = ob.reverseTwoDArrayOfString(stArr);

        for (int i=0;i< reverStArr.length ;i++)
        {
            for (int j=0;j<reverStArr[i].length;j++)
            {
                System.out.print(reverStArr[i][j]+"\t");
            }

            System.out.println();

        }

        MyClassDemo myClassDemo = new MyClassDemo();
        myClassDemo = ob.loadMyClassDemoObject();
        myClassDemo.display();
    }
}
