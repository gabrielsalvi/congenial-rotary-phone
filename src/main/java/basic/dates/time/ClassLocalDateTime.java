package basic.dates.time;

import java.time.LocalDateTime;

public class ClassLocalDateTime
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime past = now.minusHours(3).minusDays(10).minusMinutes(30);

        System.out.println("Now: " + now);
        System.out.println("Past: " + past);
    }
}
