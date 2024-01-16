package StringDemos;

public class SplitDemo2 {

    public static void main(String[] args) {
        
        String str = "is this a real choice";
      //  String[] stArr = str.split("a");
        String[] stArr = str.split("re");

        for (int i =0;i< stArr.length ;i++)
            System.out.println(stArr[i]);
    }
}
