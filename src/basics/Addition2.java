package basics;

import java.util.Scanner;

public class Addition2 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a=");
        a = sc.nextDouble();

        System.out.println("please enter b=");
        b = sc.nextDouble();

        c = a + b ;
        System.out.println("c="+c);
    }
}
