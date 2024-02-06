package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

      //  try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
       /* }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }*/
        System.out.println("end of the file");
    }
}
