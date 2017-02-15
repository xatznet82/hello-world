package gr.haec.animals;

public class Snake extends Reptile{
	
	private String type;
	
	public Snake(boolean isVeg, String eats, String name, boolean isPoisonous, String type) {
		
		super(isVeg, eats,name,true);
		this.type=type;
	}
}
