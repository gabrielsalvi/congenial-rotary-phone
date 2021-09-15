package date.dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class ClassDateFormat
{
    public static void main(String[] args)
    {
        Date now = new Date();

        String dateFormatted = DateFormat.getInstance().format(now);

        System.out.println(dateFormatted);
    }

}
