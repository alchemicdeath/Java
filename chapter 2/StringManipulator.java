import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class StringManipulator
{
    public static void main(String[] args)
    {
        String city;
        String upper;
        String lower;
        char initial;
        int length;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the city name? ");
        city = input.nextLine();
        length = city.length();
        upper = city.toUpperCase();
        lower = city.toLowerCase();
        initial = city.charAt(0);
        
        System.out.println(length);
        System.out.println(city);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(initial);
    }
}
