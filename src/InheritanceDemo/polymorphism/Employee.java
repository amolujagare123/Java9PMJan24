package InheritanceDemo.polymorphism;

public class Employee {
    int salary  = 35000;
     void attendance()
    {
        System.out.println("Attendance");
    }
}

class Programmer extends Employee
{
    int bonus = 10000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    protected void attendance() // default
    {
        System.out.println("Programmer Attendance");
    }
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Bonus="+p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.attendance();

        Employee ob =  new Programmer(); //upcasting
        ob.attendance();
    }
}
