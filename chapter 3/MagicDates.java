import java.util.Scanner;

public class MagicDates
{
    public static void main(String[] args)
    {
       int day,
        month,
        year;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Day ");
        day = input.nextInt();
        
        System.out.print("Month in numbers ");
        month = input.nextInt();
        
        System.out.print("Last two digits on year ");
        year = input.nextInt();
        
        if(year == day*month)
        {
            System.out.print("This is a magic date!\n");
        }
        else
            System.out.print("This is not a magic date.\n");
    }
}