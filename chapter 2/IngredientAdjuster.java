import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class IngredientAdjuster
{
    public static void main(String[] args)
    {
        double per48Sugar = 1.5;
        double per48Butter = 1;
        double per48Flour = 2.75;
        int cookies;
        double flourNeeded;
        double butterNeeded;
        double sugarNeeeded;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many cookies do you wish? ");
        cookies = input.nextInt();
        
        flourNeeded = per48Flour/48 * cookies;
        butterNeeded = per48Butter/48 * cookies;
        sugarNeeeded = per48Sugar/48 * cookies;
        
        System.out.printf("You will need %.1f", flourNeeded);
        System.out.print(" cups of flour.\n");
        System.out.printf("You will need %.1f", butterNeeded);
        System.out.print(" cups of butter.\n");
        System.out.printf("You will need %.1f", sugarNeeeded);
        System.out.print(" cups of sugar.");
        
    }
 }
