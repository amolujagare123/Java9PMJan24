package basics;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a=");
        a = sc.nextInt();

        System.out.println("please enter b=");
        b = sc.nextInt();

        c = a + b ;
        System.out.println("c="+c);
    }
}
