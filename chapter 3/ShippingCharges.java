import java.util.Scanner;

public class ShippingCharges
{
    public static void main(String[] args)
    {
        double weight;
        double distance;
        double cost;
        double totalDistance;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much does the package weigh? ");
        weight = input.nextDouble();
        System.out.println("What is the distance? ");
        distance = input.nextDouble();
        
        totalDistance = distance/500;
        
        if (weight <= 2)
        {
            cost = 1.10 * totalDistance;
        }
        
        else if ((weight >= 2) && (weight <= 6))
        {
            cost = 2.20 * totalDistance;
        }
        
        else if ((weight >= 6) && (weight <= 10))
        {
            cost = 3.70 * totalDistance;
        }
        
        else
        {
            cost = 3.80 * totalDistance;
        }
        
        System.out.printf("The total cost is $%.2f", cost);
    }
}