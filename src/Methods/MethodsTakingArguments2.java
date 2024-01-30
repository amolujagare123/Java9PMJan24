package Methods;

import basics.ClassPack.BookPublication;
import basics.ClassPack.MyClassDemo;

public class MethodsTakingArguments2 {

    void setObjectValues(MyClassDemo obj)
    {
        obj.a = 10;
        obj.d = 10.33;
        obj.c = 'c';
        obj.str = "Sheetal";
    }


    public static void main(String[] args) {
        MethodsTakingArguments2 ob = new MethodsTakingArguments2();


        MyClassDemo myClassDemo = new MyClassDemo();

        ob.setObjectValues(myClassDemo);

        myClassDemo.display();

    }
}
