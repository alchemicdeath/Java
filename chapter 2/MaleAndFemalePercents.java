import java.util.Scanner;

public class MaleAndFemalePercents
{
    public static void main(String[] args)
    {
        int male;
        double malePercent;
        int female;
        double femalePercent;
        double total;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many males are in the class? ");
        male = input.nextInt();
        System.out.println("How many females are in the class? ");
        female = input.nextInt();
        
        total = male + female;
        malePercent = male / total * 100;
        femalePercent = female / total * 100;
        
        System.out.println("There are " + male + " males, with a percent of  "
        + malePercent + "%."    );
        System.out.println("There are " + female + 
        " females with a percent of  " + femalePercent + "%."    );
        
    }
}