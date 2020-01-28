import java.util.Scanner;

public class FatGramCalculator
{
    public static void main(String[] args)
    {
        int cal;
        int fat;        
        double calFromFat;
        double percent;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many calories? ");
        cal = input.nextInt();
        
        System.out.print("How much fat? ");
        fat = input.nextInt();
        
        calFromFat = fat*9;
        
        percent = calFromFat/cal;
        
        System.out.print("Percent of calories " + percent + "%");
        System.out.print("\nCalories from fat " + calFromFat);
    }
}