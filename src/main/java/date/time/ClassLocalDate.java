package date.time;

import java.time.LocalDate; //yyyy-MM-dd

public class ClassLocalDate
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);

        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
    }
}
