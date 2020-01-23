import java.util.Scanner;

public class StockTransaction
{
    public static void main(String[] args)
    {
        int sharesPurchased;
        double costPer = 32.87;
        double commission = .2;
        int sharesSold;
        double soldPer = 33.92;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many Shares were purchased? ");
        sharesPurchased = input.nextInt();
        
        System.out.print("How many Shares were sold? ");
        sharesSold = input.nextInt();
        
        double purchase = sharesPurchased * costPer;
        double sold = sharesSold * soldPer;
        double profit = sold - purchase * .8;
        double paidCom = profit*commission;
        
        System.out.printf("The profit made is $%.2f\n", profit);
        System.out.printf("The commission is $%.2f", paidCom);
        
    }
}