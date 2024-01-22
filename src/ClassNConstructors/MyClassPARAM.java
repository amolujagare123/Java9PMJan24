package ClassNConstructors;

public class MyClassPARAM {
    int a;
    double d;
    char c;
    String str; // data members
   /* MyClass2() // Empty Constructor
    {

    }*/

    MyClassPARAM(int a1,double d1,char c1,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassPARAM ob = new MyClassPARAM(12,34.56,'h',"selenium");

        ob.display();

    }
}
