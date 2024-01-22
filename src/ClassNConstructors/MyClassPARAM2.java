package ClassNConstructors;

// Parameterized constructor with this operator
public class MyClassPARAM2 {
    int a;
    double d;
    char c;
    String str; // data members
   /* MyClass2() // Empty Constructor
    {

    }*/

    MyClassPARAM2(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassPARAM2 ob = new MyClassPARAM2(12,34.56,'h',"selenium");

        ob.display();

    }
}
