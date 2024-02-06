package ExceptionHandling;

public class CheckNumber {

    // check if the number is in between 1 to 10

    void checkNumber(int i) throws Exception {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) throws Exception {

        int a = 12 ;

        System.out.println("Start of the program");
        System.out.println("a="+a);
        System.out.println("Checking number");

        CheckNumber ob = new CheckNumber();
        
        ob.checkNumber(a);

        System.out.println("Number is checked");
        System.out.println("End of the program");

    }
}
