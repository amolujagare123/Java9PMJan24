package Methods;

public class MethodsReturningValue {

    int myMethod()
    {
        System.out.println("inside my method");
        System.out.println("this method returns int type of value");
        int x = 90;

      //  return 10 ;
        return x ;
    }

    public static void main(String[] args) {

        MethodsReturningValue ob = new MethodsReturningValue();

        int b;
        b = 70;
        System.out.println(b);
        int d = b;

        System.out.println("ob.myMethod() -> "+ob.myMethod());

        int y = ob.myMethod() ;
        System.out.println("y="+y);
    }
}
