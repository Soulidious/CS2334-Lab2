/**
 * Class to represent an animal in a zoo. Animals have a color, name, weight, and height.
 * 
 * @author Stephen Thung
 * @version 2019-01-23
 * Modified by Mohammad Mukhtaruzzaman on 2019-08-27
 * Modified by Joseph Lucas on 2019-08-29
 */
public class Animal 
{
    /**
     * The color of the animal
     */
    private String color;
    
    /**
     * The name of the animal
     */
    private String name;

    /**
     * The weight of the animal in pounds
     */
    private double weight;

    /**
     * The height of the animal in inches
     */
    private double height;


    /**
     * Empty (Default) Constructor
     * 
     * Sets the weight to 0, age to 0, name to "noname", and color to "unknown"
     */
    public Animal()
    {
    	this.weight =0;
    	this.height = 0;
    	this.name = "noname";
    	this.color = "unknown";
    	
    }
    
    /**
     * Animal constructor setting all fields.
     * 
     * @param color The animal color.
     * @param name The animal's name.
     * @param weight The animal's weight in pounds.
     * @param height The animal's height in inches.
     */
    public Animal(String color, String name, double weight, double height)
    {
       this.color = color;
       this.name = name;
       this.weight = weight;
       this.height = height;
    }
   
    /**
     * Fetches the animal's weight.
     * 
     * @return The animal's weight in pounds.
     */
    public double getWeight()
    {
    	return this.weight;
    }
    
    /**
     * Fetches the animal's height.
     * 
     * @return The animal's height in pounds.
     */
    public double getHeight()
    {
    	return this.height;
    }

    /**
     * Fetches the animal's color.
     * 
     * @return The animal's color.
     */
    public String getColor()
    {
    	return this.color;
    }
    
    /**
     * Fetches the animal's name.
     * 
     * @return The animal's name.
     */
    public String getName()
    {
    	return this.name;
    }
    
    /**
     * When the user needs to print out info about an animal, present
     * the animal in order of color, name, weight, and height
     * 
     * @return The string representation of the Animal class, formatted as:
     *         "(name): a (color)-colored animal - (weight) pounds and (height) inches.\n"
     * Weight and height are formatted to one decimal place.
     */
    public String toString()
    {
        return String.format("%s: a %s-colored animal - %.1f pounds and %.1f inches.\n",this.name,this.color,this.weight,this.height);
    }
}
