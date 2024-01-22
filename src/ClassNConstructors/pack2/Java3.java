package ClassNConstructors.pack2;

import ClassNConstructors.pack1.Java1;

public class Java3 extends Java1 {

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 90 ;
        ob.d = 23.56;
        ob.c= 'h';
        ob.str = "amol";

        ob.display();


        Java3 j3 = new Java3();
        j3.a = 10;
        j3.str = "my string";
    }
}
