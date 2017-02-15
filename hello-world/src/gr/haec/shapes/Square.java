package gr.haec.shapes; 

public class Square {
	
	double side1; 	     // side 1 double
	
	public Square (double side1) {     // Constructor Square(double) 
		this.side1=side1;
		
	}
	
	double SquareArea () { 			// method that returns square area 
		double squareArea = side1 * side1; 
		return squareArea; 
		}
	
	double SquarePerimeter () {			// method that returns square perimeter 
		double squarePerimeter = side1 * 4;
		return squarePerimeter; 
	}
	
	void printSquareArea () {					// method that prints square area 
		System.out.println( "Square's area is : " + SquareArea());
	}
	
	void printSquarePerimeter () {					// method that prints square area 
		System.out.println( "Square's Perimeter is : " + SquarePerimeter());
	}
	
	
}
