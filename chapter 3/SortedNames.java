/**
    Application to input and sort up to 3 names
*/
import java.util.Scanner;

public class SortedNames
{
    public static void main(String[] args)
    {
    	//declared variables//
    	String entry1;
    	String entry2;
    	String entry3;

        //accept user input//
    	Scanner name = new Scanner(System.in);

        //user input for the names//
        System.out.println("What is the first name: ");
        entry1 =name.nextLine();
        System.out.println("What is the second name: ");
        entry2 =name.nextLine();
        System.out.println("What is the third name: ");
        entry3 =name.nextLine();

        //placed to space out list from input//
        System.out.println(" ");

        //compare Entry1 and Entry2 to set the list if 1 is greater//
        if (entry1.compareToIgnoreCase(entry2) < 0 && entry1.compareToIgnoreCase(entry3) < 0)
        {
        	System.out.println(entry1);
            //compare Entry2 and Entry3 for the last 2 names//
            if (entry2.compareToIgnoreCase(entry3) < 0)
            {
                System.out.println(entry2);
                System.out.println(entry3);
            }
            //final set if 3 is greater//
            else
            {
               System.out.println(entry3);
               System.out.println(entry2); 
            }
        }
        //second for if 2 is greater than 1//
        else if (entry2.compareToIgnoreCase(entry1) < 0 
        && entry2.compareToIgnoreCase(entry3) < 0)
        {
        	System.out.println(entry2);
            //compare Entry1 and Entry3 for the last 2 names//
            if (entry1.compareToIgnoreCase(entry3) < 0)
            {
                System.out.println(entry1);
                System.out.println(entry3);
            }
            //final set if 3 is greater//
            else
            {
                System.out.println(entry3);
                System.out.println(entry1);
            }
        }
        //Final check based on t3 being greater than the others//
        else
        {
            System.out.println(entry3);
            //compare Entry1 and Entry2 again//
            if (entry1.compareToIgnoreCase(entry2) <0)
            {
                System.out.println(entry1);
                System.out.println(entry2);
            }
            //final set if 2 is the greater//
            else
            {
                System.out.println(entry2);
                System.out.println(entry1);
            } 
        }
    }
}