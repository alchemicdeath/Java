import java.util.Scanner;

/**
@author JPD AlchemicDeath
*/

public class WordGame
{
    public static void main(String[] args)
    {
       String name, age, city, college,  profession, animal,  petName;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("what is your name? ");
       name = input.nextLine();
       
       System.out.print("What is your age? ");
       age = input.nextLine();
       
       System.out.print("What city do you live in ?");
       city = input.nextLine();
       
       System.out.print("What college do you go to? ");
       college = input.nextLine();
       
       System.out.print("What is your profession? ");
       profession = input.nextLine();
       
       System.out.print("What kind of pet do you have? ");
       animal = input.nextLine();
       
       System.out.print("What i your pets name? ");
       petName = input.nextLine();
       
       System.out.print("There once was a person named " + name + 
                            ", who lived in " + city + ". At the age of " + age 
                            + ", " + name + " went to college at " + college + 
                            ", " + name + ", graduated and went to work as a " 
                            + profession + ".Then, " + name + " adopted a(n)" 
                            + animal + ", named " + petName 
                            + ". They both lived happily ever after!");
    }
}
