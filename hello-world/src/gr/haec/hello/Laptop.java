package gr.haec.hello;
import gr.haec.math.Operations; 
import java.util.Scanner;

public class Laptop {

	String manuf, model, cpu = "intel";
	int ram = 4;
	float hddCapacity;
	boolean hddSsd = false , hddDvd; 

	
	public Laptop() {
		
	}
	
	public Laptop(String manuf , String model, String cpu) {
		this.manuf = manuf ;
		this.model = model;
		this.cpu = cpu;
		
	}

	void setRAM (int newRam) {  //setter for ram 
	ram = newRam;
		}

	void printRAM () {   //print ram 
	String message = "Η μνήμη του Laptop έιναι ";
	System.out.println(message + ram);
		}
	
	void addRAM (int extraRAM) {  //add extra RAM
		
		// ram = ram+extraRAM;
		
		Operations op = new Operations();
		
		//ram = sum(ram,extraRAM);
		ram = (int) op.sum(5, 5);
		
		}

	void userInsertRAM () {
		
		int userRAM;
		System.out.println("Enter new RAM : ");
		Scanner userInput = new Scanner(System.in);
		userRAM = userInput.nextInt(); 
		//System.out.println("New RAM is : " + userRAM);
		ram = userRAM; 
	}

}
