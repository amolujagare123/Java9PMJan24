package ArraysDemo;

public class StringArray {

    public static void main(String[] args) {

        String[] stArr = new String[10];

        stArr[0] = "Aarav";
        stArr[1] = "Neha";
        stArr[2] = "Kiran";
        stArr[3] = "Priya";
        stArr[4] = "Rahul";
        stArr[5] = "Ananya";
        stArr[6] = "Amit";
        stArr[7] = "Smita";
        stArr[8] = "Vikram";
        stArr[9] = "Divya";

        for (String str : stArr)
            System.out.println(str);
    }
}
