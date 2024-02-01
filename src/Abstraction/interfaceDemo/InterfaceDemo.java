package Abstraction.interfaceDemo;

import basics.ClassPack.MyClassDemo;

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

    void display();


}

interface AnotherInterface
{
    void display();
}

class ChildInterface extends MyClassDemo implements InterfaceDemo , AnotherInterface
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        InterfaceDemo id = new ChildInterface();

        id.display();


    }

}
