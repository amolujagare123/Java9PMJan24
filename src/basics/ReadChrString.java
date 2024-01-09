package basics;

import java.util.Scanner;

public class ReadChrString {

    public static void main(String[] args) {

        char c;
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter c =");
        c = sc.nextLine().charAt(0);

        System.out.println("c="+c);

        System.out.println("Enter str =");
        str = sc.nextLine();
        System.out.println("str="+str);

    }
}
