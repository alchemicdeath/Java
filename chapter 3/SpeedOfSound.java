/**
    Program to find the time it will take to pass  a medium
*/

import java.util.Scanner;

public class SpeedOfSound
{
    public static void main(String[] args)
    {
        String medium; //choice in medium, holds input//
        double time;	  //time variable//
        double distance; //distance variable, holds input//

        //create new scanner input//
        Scanner keyboard = new Scanner(System.in);

        //Requests user input for medium//
        System.out.println("Enter your medium, Either air, steel, or water: ");
        medium =keyboard.nextLine();
        //Requests user input for distance//
        System.out.println("Enter travel distance in feet: ");
        distance =keyboard.nextDouble();

        //if the medium is air//
        if (medium.equalsIgnoreCase("air")) 
        {
            time = distance / 1100;
            System.out.println("The Speed is " + time + " seconds");
        } 
        //if the medium is water//
        else if (medium.equalsIgnoreCase("water")) 
        {
            time = distance / 4900;
            System.out.println("The Speed is " + time + 
                " seconds");
        } 
        else if (medium.equalsIgnoreCase("steel")) 
        {
            time = distance/16400;
            System.out.println("The Speed is " + time + 
                " seconds.");
        }
    }
}