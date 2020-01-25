import java.util.Scanner;

/**
@author JPD AlchemicDeath
This program recives three user grade entries and
displays a given letter grade.
*/

public class TestScoreAndGrade
{
    public static void main(String[] args)
    {
        double average, test1, test2, test3;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter test score 1: ");
        test1 = input.nextInt();
        
        System.out.print("Enter test score 2: ");
        test2 = input.nextInt();
        
        System.out.print("Enter test score 3: ");
        test3 = input.nextInt();
        
        average = (test1 + test2 + test3)/3;
        
        if (average >= 90)
        {
            System.out.printf("Test average: %.2f\t A", average);
        }
        else if(average >= 80 && average < 90)
        {
            System.out.printf("Test average: %.2f\t B", average);
        }
        else if(average >= 70 && average < 80)
        {
            System.out.printf("Test average: %.2f\t C", average);
        }
        else if(average >= 60 && average <70)
        {
            System.out.printf("Test average: %.2f\t D", average);
        }
        else
        {
            System.out.print("Test average: " + average + "\tF");
        }
    }
}