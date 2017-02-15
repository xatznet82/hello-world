package gr.haec.animals;

public class MainClass {

	public static void main(String[] args) {
		Animal Gata = new Animal(true,"psaria", "psipsina");
		Animal Cassie= new Cat(false,args[0], "kroketes", "mixed", args[1]);
		System.out.println(Gata.getName());
		System.out.println(Cassie.getName());
		System.out.println(Cassie);
		
		System.out.println(Cassie instanceof Fish);
		System.out.println(Cassie instanceof Cat);
		System.out.println(Cassie instanceof Animal);
				
		
	
	if (Cassie instanceof Animal) {
		System.out.println("correct");
	}
	else 
		System.out.println("wrong");

	}
}

