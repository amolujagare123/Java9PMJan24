package InheritanceDemo;

public class Employee {
    int salary  = 35000;
    void attendance()
    {
        System.out.println("Attendance");
    }
}

class Demo
{
    void myDemo()
    {
        System.out.println("myDemo");
    }
}

class Programmer extends Employee
{
    int bonus = 10000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Bonus="+p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.attendance();
    }
}
