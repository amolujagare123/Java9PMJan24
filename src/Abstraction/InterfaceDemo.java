package Abstraction;

public interface InterfaceDemo {

    void run();
    void start();

    default void myMethod1()
    {
        System.out.println("myMethod1");
    }

    static void myMethod2()
    {
        System.out.println("myMethod1");
    }

    static void display()
    {
        System.out.println("display");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo id = new ChildInterface();
        id.start();
        id.run();
        id.myMethod1();
        InterfaceDemo.myMethod2();
    }

}
