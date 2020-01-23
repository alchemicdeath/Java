import java.util.Scanner;

public class CookieCalorie
{
	public static void main(String[] args)
	{
	    double oneCookie = 75;
        double cookies;
        double calories;

        Scanner input = new Scanner(System.in);
        
		System.out.print("how many cookies did you eat? ");
        cookies= input.nextDouble();
        
        calories = cookies * 75;
        
        System.out.println("Your total calories is " + calories + "calories.");
	}
}