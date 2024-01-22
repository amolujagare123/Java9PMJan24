package StringDemos;

public class SplitDemo3 {

    public static void main(String[] args) {
        
        String str = "Hey baby you are so lovely";
        String[] stArr = str.split(" ");

        for (int i =0;i< stArr.length ;i++) {

            if(stArr[i].endsWith("y")) // Hey
            System.out.println(stArr[i]);
        }

       /* for (int i =0;i< stArr.length ;i++) {

            String temp = stArr[i]; // {Hey, baby, you, are, so, lovely}
            int l = temp.length();

            if(temp.charAt(l-1)=='y')
                System.out.println(stArr[i]);
        }*/
    }
}
