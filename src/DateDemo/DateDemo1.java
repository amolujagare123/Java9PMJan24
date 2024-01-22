package DateDemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();

        System.out.println(date);

        // dd-MM-yyyy

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sd.format(date));

        String dateStr  = "23/04/2000";
        SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateStr);
        System.out.println(sd2.parse(dateStr));

    }
}
