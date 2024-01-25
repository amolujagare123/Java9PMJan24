package FinalAndStatic;

public final class Employee {
    int salary  = 35000;
    final void attendance()
    {
        System.out.println("Attendance");
    }
}
class Programmer // extends Employee
{
    void attendance()
    {
        System.out.println("Programmer Attendance");
    }
    int bonus = 10000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Bonus="+p.bonus);
        p.programmerWork();
    //    System.out.println(p.salary);
        p.attendance();
    }
}
