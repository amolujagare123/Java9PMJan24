package basics.ClassPack;

public class MyClassDemo {
    public int a;
    public double d;
    public char c;
    public String str; // data members

    public void display()
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

        MyClassDemo ob = new MyClassDemo();

        ob.a = 90 ;
        ob.d = 23.56;
        ob.c= 'h';
        ob.str = "amol";

        ob.display();

        MyClassDemo ob2 = new MyClassDemo();

        ob2.a = 50 ;
        ob2.d = 11.56;
        ob2.c= 'c';
        ob2.str = "shivani";

        ob2.display();


    }
}
