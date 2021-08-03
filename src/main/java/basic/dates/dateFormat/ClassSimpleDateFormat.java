package basic.dates.dateFormat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ClassSimpleDateFormat
{
    public static void main(String[] args)
    {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");

        String date = formatter.format(now);

        System.out.println(date);
    }
}
