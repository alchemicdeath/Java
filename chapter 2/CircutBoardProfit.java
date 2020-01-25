import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class CircutBoardProfit
{
    public static void main(String[] args)
    {
        double profit;
        double retail;
        double percent = .04;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How much is the retail price? ");
        retail = input.nextDouble();
        
        profit = retail * percent;
        
        System.out.printf("The profit is $%.2f \n", profit);
    }
}
