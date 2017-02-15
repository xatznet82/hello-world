package gr.haec.animals;

public class Dog extends Mammal{
	
	private String breed;
	private String colour;
	
	public Dog(boolean isVeg, String eats, String name, String breed, String colour) {
		super(isVeg, eats,name,4); 
		this.breed=breed;
		this.colour=colour;
	}

}
