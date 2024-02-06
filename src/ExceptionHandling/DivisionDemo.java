package ExceptionHandling;

public class DivisionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 0;

       try {
            c = a / b;
      }
       catch (ArithmeticException e)
       {
           System.out.println("inside catch 1");

       }
        catch (Exception e)
        {
            System.out.println("inside catch");

            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            e.printStackTrace();
        }

       catch (Throwable e)
       {
           System.out.println("inside catch");

           System.out.println(e);
           System.out.println(e.getMessage());
           System.out.println(e.getClass());

           e.printStackTrace();
       }
       finally {
           System.out.println("inside finally");
       }


        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
