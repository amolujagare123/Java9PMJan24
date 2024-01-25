package FinalAndStatic.SampleDemo;

import FinalAndStatic.StaticMethodDemo;

/*import static FinalAndStatic.StaticMethodDemo.staticMethod1;
import static FinalAndStatic.StaticMethodDemo.staticMethod2;
import static FinalAndStatic.StaticMethodDemo.college;*/

import static FinalAndStatic.StaticMethodDemo.*;
public class StaticDemo2 {

    void testMethod()
    {
        StaticMethodDemo ob = new StaticMethodDemo();
        ob.staticMethod1(); // using object of the class
        staticMethod2();

        // using class name
        StaticMethodDemo.staticMethod1();
        staticMethod2();

        staticMethod1();
        staticMethod2();
        System.out.println(college);
    }
    public static void main(String[] args) {

    }
}
