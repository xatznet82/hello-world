 package gr.haec.math;


public class Operations {
	
	int g;
	
	double number1;
	double number2;
	
	/* public Operations () {
		
	}
	
	public Operations (double number1, double number2) {
	    this.number1=number1;
		this.number2=number2;
		}
		
		*/ 
	
	 double sum () {
		
		double number3 = number1 + number2; 
		return number3; 
		 
		}
	 
	 public double sum (double x, double y) { 
		 
		 return x + y; 
		 // or double z; 
		 // z = x + y;
		 // return z;
	 }
	 
	 
	 boolean isEven (int x) {    // method that checks if a number is even prime 
		 
		 int y = x % 2 ;        // check the ypoloipo 
		 boolean z;				// create z as boolean
		 if (y==0) { 			// check if y =0
			 z = true; 			
		 }  else {
			 
			 z= false;
		 }
		 return z; 
	 }
	  
	 
	 int sum35 (int x) {		// method that checks if a number is devided with 3 or 5 
		  
		  int result = 0 ;			// variable result = 0
		  for (int y = 0; y < x; y++) {		// loop that adds a number 
			  
			  int z = y % 3;				// variable int z 
			  int h = y % 5;				// variable int h 
			  
			  if (z == 0 || h == 0 ) {		// if statement that checks if z=0 or h=0 
				  result += y; 			// result einai result + y 
			  }
		  }
			  return result;					//  return to synollo 
		  	 
	  }
	 
	 /** 
	  * method that calculates min and max of an array
	  * @param pinakas
	  * pinakas 
	  * min
	  * max
	  */
	 
	 void maxMin (int []pinakas) {
		 
		 int x = pinakas.length; 
		 int min = pinakas[0];
		 int max = pinakas[0]; 
		 
		 for (int y=0; y < x; y++) {
			 
			 if (pinakas [y] < min) { 
				 min = pinakas[y]; 
			 }  
			 
			 if (pinakas [y] > max) {
				 max = pinakas[y]; 		
			}
		 }
		 System.out.println("To max einai " + max);
		 System.out.println("To min einai " + min);
	 }
	
	
public static void main (String [] args) { 
	
	// Operations newOp = new Operations (2.2 , 3.3);
	// System.out.println(newOp.number1 + " " + newOp.number2); 
	
	Operations check = new Operations ();
	
	System.out.println("The result is " + check.isEven (10));
	
	Operations sum = new Operations ();
	
	System.out.println(sum.sum35(1000));
	
	Operations pinakas1 = new Operations ();
	
	int [] pinakas = { 2,4,6,8,10,12,14,16,18,20,55,7,9} ;
	
	pinakas1.maxMin(pinakas);
		
	
	
	// System.out.println ("The result is : " + newOp.sum());
	
	// System.out.println("The result is : " + newOp.sum(2,3));
	
	}
}