package ClassNConstructors;

public class MyClass {
    int a;
    double d;
    char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x;
        x = 10 ;
        System.out.println(x);

        MyClass ob = new MyClass();

        ob.a = 90 ;
        ob.d = 23.56;
        ob.c= 'h';
        ob.str = "amol";

        ob.display();

        MyClass ob2 = new MyClass();

        ob2.a = 50 ;
        ob2.d = 11.56;
        ob2.c= 'c';
        ob2.str = "shivani";

        ob2.display();


    }
}
