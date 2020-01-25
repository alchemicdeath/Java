import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class RestaurantBill
{
    public static void main(String[] args)
    {
        double mealCost;
        double tax = .675;
        double tip = .2;
        double total;
        double taxTotal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much was the meal? ");
        mealCost = input.nextDouble();
        
        taxTotal = mealCost * tax;
        tip = mealCost * tip;
        total = mealCost + taxTotal + tip;
        
        System.out.printf("The meal cost is $%.2f%n", mealCost);
        System.out.printf("the tax is $%.2f%n", tax);
        System.out.printf("the tip is $%.2f%n", tip);
        System.out.printf("the total is $%.2f%n", total);
    }
}
