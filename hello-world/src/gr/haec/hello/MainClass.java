package gr.haec.hello;


public class MainClass {
	
	public static void main(String []args) {
		
		Laptop dell = new Laptop ();  
				
		dell.setRAM (16);    //set new ram 
		dell.printRAM ();     // print ram 
		
		
		Laptop hp = new Laptop ("hp" , "folio", "intel");
		
		hp.printRAM ();     // print ram 
		
		
		Laptop asus = new Laptop ();
		
		asus.addRAM(4);
	    asus.printRAM();
	    asus.userInsertRAM(); 
		asus.printRAM(); 
		
		}

}
