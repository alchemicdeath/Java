import java.util.Scanner;

public class BankCharges
{
    public static void main(String[] args)
    {
        double base = 10;
        int checks;
        double fee;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many checks were written this month? ");
        checks = input.nextInt();
        
        if (checks < 20)
        {
            fee = (.10 * checks)+10;
            System.out.printf("The total fees are $%.2f", fee);
        }
        else if (checks < 40 && checks >= 20)
        {
            fee = (.08 * checks)+10;
            System.out.printf("The total fees are $%.2f", fee);
        }
        else if (checks <60 && checks >= 40)
        {
            fee = (.06 * checks)+10;
            System.out.printf("The total fees are $%.2f", fee);
        }
        else
        {
            fee = (.04 * checks)+10;
            System.out.printf("The total fees are $%.2f", fee);
        }
    }
}