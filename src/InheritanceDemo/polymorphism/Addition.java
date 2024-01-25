package InheritanceDemo.polymorphism;

public class Addition {
    int a;
    int b;
    void add()
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }
    void add(int x)
    {
        int c;
        c = x + b;
        System.out.println("c="+c);
    }
    void add(int x,int y)
    {
        int c;
        c = x + y;
        System.out.println("c="+c);
    }
    void add(double x,double y)
    {
        double c;
        c = x + y;
        System.out.println("c="+c);
    }
    void add(String x,String y)
    {
        String c;
        c = x + y;
        System.out.println("c="+c);
    }
    void add(int x,int y,int z)
    {
        int c;
        c = x + y + z;
        System.out.println("c="+c);
    }
    public static void main(String[] args) {

        Addition ob = new Addition();
        ob.a =90;
        ob.b =67;
        ob.add();
        ob.add(20);
        ob.add(20,20);
        ob.add(20,20,20);
        ob.add(20.11,20.34);
        ob.add("text1","text2");


        System.out.println("Hello World");

    }
}
