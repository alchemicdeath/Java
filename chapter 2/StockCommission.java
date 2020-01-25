import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class StockCommission
{
    public static void main(String[] args)
    {
        double shares;
        double perStock = 21.77;
        double paid;
        double commision;
        double total;

        Scanner input = new Scanner(System.in);
        
        System.out.print("How many share were bought? ");
        shares =input.nextDouble();
        
        paid = shares * perStock;
        commision = shares * perStock * .02;
        total =commision + paid;
        
        System.out.printf("The total paid was $%.2f%n", total);
    }
}
