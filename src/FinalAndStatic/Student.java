package FinalAndStatic;

public class Student {

    int rno;
    String name;
    static String college = "ITC";

    //static final double pi = 3.14;
    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student.college = "Delhi college";

        System.out.println(Student.college);

        s1.rno = 1;
        s1.name = "Rumpa";

        s2.rno = 2;
        s2.name = "Milthilesh";
      //  s2.college = "Pune college";

        s3.rno = 3;
        s3.name = "Kanika";



        s1.display(); //*/
        s2.display(); //
        s3.display(); //

    }

}
