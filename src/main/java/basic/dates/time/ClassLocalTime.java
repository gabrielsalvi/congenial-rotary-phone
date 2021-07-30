package basic.dates.time;

import java.time.LocalTime;

public class ClassLocalTime
{
    public static void main(String[] args)
    {
        LocalTime now = LocalTime.now();
        LocalTime previous_hour = now.minusHours(1);

        System.out.println("Now: " + now);
        System.out.println("Previous hour: " + previous_hour);
    }
}
