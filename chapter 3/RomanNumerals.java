import java.util.Scanner;

public class RomanNumerals
{
    public static void main(String[] args)
    {
        int user;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number between 1-10. ");
        user = input.nextInt();
        
        if(user == 1)
        {
            System.out.println("I");
        }
        
        else if (user == 2)
        {
            System.out.println("II");
        }
        
        else if (user == 3)
        {
            System.out.println("III");
        }
        
        else if (user == 4)
        {
            System.out.println("IV");
        }
        
        else if (user == 5)
        {
            System.out.println("V");
        }
        
        else if (user == 6)
        {
            System.out.println("VI");
        }
        
        else if (user == 7)
        {
            System.out.println("VII");
        }
        
        else if (user == 8)
        {
            System.out.println("VIII");
        }
        
        else if (user == 9)
        {
            System.out.println("IX");
        }
        
        else if (user == 10)
        {
            System.out.println("X");
        }
        
        else
        {
            System.out.println("Error!");
        }
    }
}