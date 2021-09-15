package date.dates;

import java.util.Date;

public class ClassDate
{
    public static void main(String[] args)
    {
        Date date = new Date();
        Date now = new Date(System.currentTimeMillis());

        System.out.println(date);
        System.out.println(now);
    }
}
