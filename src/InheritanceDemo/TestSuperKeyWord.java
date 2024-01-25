package InheritanceDemo;

class MySuperClass
{
    MySuperClass()
    {
        System.out.println("My Super Class 1");
    }
    MySuperClass(int a)
    {
        System.out.println("a="+a);
        System.out.println("My Super Class 2");
    }
    MySuperClass(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("My Super Class 3");
    }
    int salary  = 35000;
    void attendance()
    {
        System.out.println("Employee Attendance");
    }
}

class MySubClass extends MySuperClass
{
    MySubClass()
    {
        super(10,12);
        System.out.println("My SubClass Class");
    }
    int salary = 25000;

   // @Override
    void attendance()
    {
        System.out.println("Programmer Attendance");
    }
    int bonus = 10000;


    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void display()
    {
        System.out.println("display");
        System.out.println("salary="+super.salary);
        super.attendance();
    }
}
public class TestSuperKeyWord {

    public static void main(String[] args) {
        MySubClass ob = new MySubClass();
        ob.display();
    }


}
