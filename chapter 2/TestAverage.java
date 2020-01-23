import java.util.Scanner;    //scanner input

/** 
    This program request user input for three test scores, averages them and 
    then displays the scores and average.
*/
   
public class TestAverage
{
    public static void main(String[] args)
    {
        double test1;            // score #1
        double test2;            // score #2
        double test3;            // score #3
        double average;      // the average of the tests

       //create new scanner input//
        Scanner input = new Scanner(System.in);

        //Requests students scores//
        System.out.print("Enter test score #1: ");
        test1 =input.nextDouble();
        System.out.print("Enter test score #2: ");
        test2 =input.nextDouble();
        System.out.print("Enter test score #3: ");
        test3 =input.nextDouble();
            
        // averages the test scores.
        average = (test1 + test2 + test3)/3;
        
        //Displays all scores//
        System.out.println("The scores entered are: " 
        + test1 + "," + test2 + "," + test3);

        //Displays the average of all students scores//
        System.out.println("Test average: " + average);
    }
}