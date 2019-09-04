
/**
 * Class to represent a zoo. Holds a list of animals that are present at the zoo.
 * Calculates statistics about these animals.
 * 
 * @author Stephen Thung
 * @version 2018-01-23
 * Modified by Mohammad Mukhtaruzzaman on 2019-08-27
 * Modified by Joseph Lucas on 2019-08-30
 */
public class Zoo
{
    /**
     * Array to keep track of all of the Zoo's animals.
     * 
     * The size of the array is the capacity of the zoo. This should match the value of the
     * member variable "capacity".
     * 
     * The number of animals in the zoo may be less than the capacity of the zoo. For example,
     * the zoo may be able to hold 5 animals at a given point (array size/capacity = 5), but only
     * contain 2 animals (numAnimals=2).
     * 
     * When an animal is added, it should be added in the first free index. I.e. if there are 2
     * animals in the array, when a third is inserted it should be inserted in index 2, as arrays
     * start from 0.
     * 
     * When an animal should be added but the zoo is full, the zoo must be expanded to increase
     * capacity.
     */
    private Animal[] animals;

    /**
     * The number of animals present in the zoo.
     */
    private int numAnimals;
    
    /**
     * The number of animals that the zoo can currently hold.
     * Should always be equal to the size of the animals array.
     */
    private int capacity;

    /**
     * Default Constructor
     * 
     * Initializes the zoo capacity (and array size) to an initial value
     * Sets the numAnimals to 0
     * 
     * @param initialCapacity The initial number of animals that the zoo can hold.
     */
    public Zoo(int initialCapacity) 
    {
    	this.capacity = initialCapacity;
    	this.animals = new Animal[initialCapacity];
    	this.numAnimals = 0;
    }
    /**
     * Doubles the capacity of the zoo (both the variable and the size of the array).
     * 
     * Remember: an array's size is immutable - it cannot be changed. Instead, to "increase" the size of the
     * animals array, you will need to create a new array with a larger size, copy over the data in the "animals"
     * array, and update the reference of the "animals" array to the new array.
     */
    private void expandZoo()
    // FIXME: java.lang.ArrayIndexOutOfBoundsException: 4
    {
    	Animal[] newCapacity = new Animal[this.animals.length * 2];
    	this.capacity = capacity * 2;
    	
    	// Iterate through this.animals and copy to newCapacity
    	for (int initIndex = 0; initIndex < this.animals.length; ++initIndex)
    	{
    		newCapacity[initIndex] = this.animals[initIndex];
    	}
    	this.animals = newCapacity;
    }

    /**
     * Add a single animal to the zoo. Adds the animal into the animals array and updates the number of animals.
     * Expands the animals array if there is not enough room to store a new animal (zoo capacity is exceeded).
     * 
     * @param ani The animal to be added to the zoo.
     */
    public void addAnimal(Animal ani)
    {
    	int last = this.animals.length -1;
    	if (!(this.animals[last] == null)) 
    	{
    		expandZoo();
    		this.animals[this.numAnimals] = ani;
    		this.numAnimals += 1;
    	}
    	else
    	{
    		this.animals[this.numAnimals] = ani;
    		this.numAnimals += 1;
    	}
    }

    /**
     * Loop over all the Animals in the zoo to compute the total height.
     * 
     * @return The sum of height of animals in the zoo.
     */
    public double getTotalHeight() 
    {
    	double totalHeight = 0;
    	for (int i = 0; i < this.animals.length; ++i)
    	{
    		totalHeight += this.animals[i].getHeight();
    	}
    	return totalHeight;
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average weight.
     * 
     * @return Average weight (rounded down) of all animals in the zoo.
     */
    public int getAverageWeight()
    {
    	double totalWeight = 0;
    	for (int i = 0; i < this.animals.length; ++i)
    	{
    		totalWeight += this.animals[i].getWeight();
    	}
    	int averageWeight = (int) (totalWeight / this.numAnimals);
    	
    	return averageWeight;
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average weight over all animals that
     * match the given color.
     * 
     * (Be sure to divide by the number of animals that match the color, not the total number of animals)
     * 
     * @param color The average weight is computed for animals of this color.
     * @return Average weight (rounded down) of all animals of a certain color in the zoo.
     */
    public int getAverageWeight(String color)
    {
    	double totalWeight_color = 0;
    	int numAnimals_color = 0;
    	for (int i = 0; i < this.animals.length; ++i)
    	{
    		if (this.animals[i].getColor().equals(color))
    		{
    			totalWeight_color += this.animals[i].getWeight();
    			numAnimals_color += 1;
    		}
    		
    	}
    	int averageWeight_color = (int) (totalWeight_color / numAnimals_color);
    	
    	return averageWeight_color;
    }

    /**
     * Retrieve the array that constitutes the animals in the zoo.
     * 
     * @return The Animal array representing the zoo.
     */
    public Animal[] getAnimals()
    {
        return animals;
    }
    
    /**
     * Get the zoo's capacity.
     * 
     * @return The zoo's capacity.
     */
    public int getCapacity()
    {
    	return capacity;
    }
    
    /**
     * Print out formatted information about the animals in the zoo.
     * 
     * @return A string representing the animals in the zoo. Formatted as:
     * "These animals are currently present in the zoo: \n" +
     * for each animal in the animals array (starting from index 0), the toString of the animal
     */    
    public String toString() 
    {
    	String inZoo = "These animals are currently present in the zoo: \n";
    	for (int i = 0; i < this.animals.length; ++i)
    	{
    		if (this.animals[i] != null)
    		{
    			inZoo += this.animals[i].toString();
    		}
    	}
    	return inZoo;
    }
}
