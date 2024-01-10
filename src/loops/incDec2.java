package loops;

public class incDec2 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i);// 8
        System.out.println(i); // 8

        /*
        a++ / a - - : here first statement gets executed
        then increment or decrement happens.
        ++a / - - a: here first increment or decrement happens
        then the statement gets executed.
   */
    }
}
