package gr.haec.animals;

public class Cat extends Mammal{
	
	private String breed;
	private String colour;
	
	public Cat(boolean isVeg, String eats, String name, String breed, String colour) {
		super (isVeg,eats,name,4);
		this.breed=breed;
		this.colour=colour;
	}
	
	public String toString () {
		return "Ειμαι ρατσα " + breed + " και χρωμα " + colour;
	}

}
