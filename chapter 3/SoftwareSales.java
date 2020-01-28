import java.util.Scanner;

public class SoftwareSales
{
    public static void main(String[] args)
    {
        int sales;
        double cost = 99;
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many packages were sold? ");
        sales = input.nextInt();
        
        double total = cost * sales;
         
        if ((sales >= 10) && (sales <= 20))
        {
            total = cost * 1.2;
        }
        
        else if ((sales >=20) && (sales <= 50))
        {
            total = cost * 1.3;
        }
        
        else if ((sales >= 50) && (sales <=100))
        {
            total = cost * 1.4;
        }
        
        else if ((sales >= 100))
        {
            total = cost * 1.5;
        }
        
        else
        {
            total = total;
        }

        System.out.printf("The total cost with discount is $%.2f", total);
    }
}