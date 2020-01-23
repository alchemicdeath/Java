import java.util.Scanner;

public class BodyMassIndex
{
    public static void main(String[] args)
    {
        int weight;
        double height;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your Weight? ");
        weight = input.nextInt();
        
        System.out.print("What is your Height in inches? ");
        height = input.nextDouble();
        
        double height2 = height*height;
        double bmiCal = weight*703;
        double bmi = bmiCal/height2;
        
        System.out.printf("Your BMI is %.1f", bmi);
    }
}