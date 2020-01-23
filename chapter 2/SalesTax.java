import java.util.Scanner;//needed for scanner input//

public class SalesTax
{
    public static void main(String[] args)
    {
        double cost;
        double stateTax =0.04;
        double countyTax = 0.02;
        double tax = stateTax + countyTax ;
        double total;
        
        Scanner purchase = new Scanner(System.in);
        
        System.out.println("How much was the purchase? ");
        cost = purchase.nextDouble();
        
        double taxCost = tax * cost;
        
        total = cost + taxCost;
        
        System.out.println("The total cost is " + total);
    }
}