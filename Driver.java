/**
 * Driver class that adds animals to a zoo and displays information about the zoo.
 * Used as a basic test of some of the code's functionality.
 * 
 * @author Stephen Thung
 * @version 2018-01-23
 * Modified by Mohammad Mukhtaruzzaman on 2019-08-27
 * Modified by Joseph Lucas on 2019-08-30
 */
public class Driver
{
    /**
     * The main method which does not utilize args.
     * Simply instantiates two Animal objects, adds
     * them to a zoo, and then prints out information about the zoo.
     * @param args String array taking command-line arguments
     */
    public static void main(String[] args) 
    {
        /*
         * You don't have to change any of this particular code however you may 
         * find it useful to play around with how the code works here.
         */
        Animal a = new Animal("Yellow", "Tiger", 370.0, 40.1);
        Animal b = new Animal("Green", "Lion", 220.5, 25.0);

        // Create a zoo and add animals to it:
        Zoo zoo = new Zoo(1);
        zoo.addAnimal(a); // Tiger
        zoo.addAnimal(b); // Lion
        
        // Print out info about the zoo:
        System.out.println(zoo);
          
    }
}