import java.util.Scanner;

public class TimeCalculator
{
    public static void main(String[] args)
    {
        int minute;
        int seconds;
        int hours;
        int days;
        int months;
        int year;
        
        Scanner input = new Scanner(System.in)
        
        if (seconds >= 60)
        {
            minute++;
        }
        
        else if (minute >= 60)
        {
            hour++;
        }

        else if (hour >= 24)
        {
            day++;
        }
        
        else if (day >= 360)
        {
            year++;
        }
    }
    
    System.out.print("Years: " + year + "Months: ")
}