package gr.haec.animals;

public class Animal {
	
	private boolean isVeg; 
	private String eats;
	private String name;
	
	public Animal(boolean isVeg, String eats, String name) {
		this.isVeg=isVeg;
		this.eats=eats;
		this.name=name;
		
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
