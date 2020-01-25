import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class MilesPerGallon
{
    public static void main(String[] args)
    {
        double mpg;
        double miles;
        double gallons;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("how many miles did you drive? ");
        miles = input.nextDouble();
        
        System.out.print("how many gallons of gas did you use? ");
        gallons = input.nextDouble();
        
        mpg = miles/gallons;
        
        System.out.printf("\nYou Miles per Gallon is %.2f mpg", mpg);
    }
}
