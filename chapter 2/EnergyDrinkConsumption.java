public class EnergyDrinkConsumption
{
    public static void main(String[] args)
    {
       double customers = 12467;
       double oneOrMore = customers * .14;
       double citrusFlavored = oneOrMore * .64;
        
        System.out.print("There are " + oneOrMore + 
                                    "customers who drink one or more energy"
                                     +"drinks a week.");
        System.out.print("Of those " + citrusFlavored + 
                                    "perfer citrus flavors");
    }
}