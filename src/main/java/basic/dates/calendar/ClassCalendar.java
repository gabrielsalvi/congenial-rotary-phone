package basic.dates.calendar;

import java.util.Calendar;

public class ClassCalendar
{
    public static void main(String[] args)
    {
        Calendar now = Calendar.getInstance();

        System.out.printf("%tD", now); // MM/dd/yy
    }
}
