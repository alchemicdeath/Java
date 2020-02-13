import java.util.Scanner;

public class MobileServiceProvider
{
	public static void main(String[] args)
	{
		double hours; 
		double cost;
		String pack;


        Scanner input = new Scanner(System.in);

        System.out.print("What package do you have? ");
		pack = input.nextLine();

        System.out.print("How many hours did you use? ");
        hours =input.nextDouble();

        pack = pack.toUpperCase();

        if(pack.equals("A"))
        {
        	if(hours>10)
        	{
        		cost = ((hours-10)*2)+9.95;
        		System.out.printf("With package A your bill is $%.2f",cost);
        	}
        	else
        	{
        		cost = 9.95;
        		System.out.printf("With package A your bill is $%.2f",cost);
        	}
        }
        else if (pack.equals("B"))
        if(hours>20)
        	{
        		cost = (hours-20)+13.95;
        		System.out.printf("With package B your bill is $%.2f",cost);
        	}
        	else
        	{
        		cost = 13.95;
        		System.out.printf("With package B your bill is $%.2f",cost);
        	}
         else if (pack.equals("B"))
         {
        	cost = 19.95;
        	System.out.printf("With package C your bill is $%.2f",cost);
        }
        else
        {
        	System.out.print("No package selected.");
        }
    }
}