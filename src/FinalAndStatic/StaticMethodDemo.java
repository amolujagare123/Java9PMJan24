package FinalAndStatic;

public class StaticMethodDemo {
    public int rno;
    public String name;
    public static String college = "ITC";

    public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static  void staticMethod1()
    {
        System.out.println("staticMethod1");
    //    System.out.println("rno="+rno); // non static - not allowed
     //   System.out.println("name="+name); // non static - not allowed
        System.out.println("college="+college); // static - allowed
        staticMethod2(); // static - allowed
      //  display();  // non static - not allowed
    }

    public static  void staticMethod2()
    {
        System.out.println("staticMethod2");
    }
    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("staticMethod1");
        System.out.println("rno="+rno); // non static -  allowed
        System.out.println("name="+name); // non static - allowed
        System.out.println("college="+college); // static - allowed
        staticMethod2(); // static - allowed
        display();  // non static -  allowed
    }

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        ob.nonStaticMethod();
        ob.staticMethod1(); // using object of the class
        ob.staticMethod2();
        ob.display();

        staticMethod1();
        System.out.println(college);
        // using class name
        StaticMethodDemo.staticMethod1();
        StaticMethodDemo.staticMethod2();
    }



}
