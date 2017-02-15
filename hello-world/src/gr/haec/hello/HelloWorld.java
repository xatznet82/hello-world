package gr.haec.hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HelloWorld {
	
	 public static void main (String[] args) {
	
	/*System.out.println("Hello World");   print Hello World 
	
		int x = 10; 
		 while (x < 10) {
			 x = x +1;
			 System.out.println("το x είναι : " + x);
			 
		 }
		
		
		 int y = 0;
		 do { 
			 y++;
			 System.out.println("το y είναι : " + y);
			 
		 } while (y < 10);
		 
		 	 
		 for (int z = 0; z < 10; z++) {
			 System.out.println("το z είναι : " + z);
		 }
		 
		 */

		 /* for (int m = 0 , n = 10; m <10 && n>5 ; m++, n--) {
			 
			 System.out.println("m = " + m + ", n = " + n);
		 }
		 */
		 
		 /* int [] array = {2,4,6,8,10};
		 
		
		 for (int x=0; x < 5; x++){
			 if (array [x] <5) {
			 System.out.println(array[x]); 
			 }  
			 	else if (array[x] > 5 && array[x] < 8) {
				 System.out.println(array[x] * array[x]);
			 }
			 	else {
			 		System.out.println(array[x] * array[x] * array[x]);
			 	}
		 }
	
			*/ 
		 
		 File f = new File("C:\tmp.txt");		// checked exception
		 try { 
		 FileReader fr = new FileReader(f);
		 		 
		 int [] pinakas = {1,2,3};						// unchecked exception 
		 
		 System.out.println(pinakas[10]);
		 
		 } catch (FileNotFoundException e){
			 //catch block code
			 e.printStackTrace();
		 }
		 catch (java.lang.ArrayIndexOutOfBoundsException e){
			 System.err.println("O pinakas exei mono 3 theseis re mastora!!");
			 // System.out.println(pinakas[1]);
		 
		 }
		 finally {
			 System.out.println("Ante geia");
		 }
	}
}
