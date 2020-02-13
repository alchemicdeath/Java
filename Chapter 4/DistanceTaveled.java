import java.util.*;

public class DistanceTaveled
{
    public static void main(String[] args)
    {
        double distance;
        int time = 0;
        double speed;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How fast did you travel in Miles Per Hour? ");
        speed = input.nextDouble();
        
        while (time < 3)
        {
           time++;
            distance = time*speed;
            System.out.print("For " +time+" hours" + ", you traveled " 
                             + distance + " miles.\n");
        } 
    }
}