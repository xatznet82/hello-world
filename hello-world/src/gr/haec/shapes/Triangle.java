package gr.haec.shapes;

public class Triangle {

	double side1;			// side 1 double
	double side2;			// side 2 double
	
	public Triangle (double side1,double side2) {			// Constructor Triangle (double,double)
		this.side1=side1;
		this.side2=side2;
	}
	
	
	double TriangleArea () {			// method that returns triangle area 
		double triangleArea = (side1 * side2) / 2; 
		return triangleArea;
	}
	
	double TrianglePerimeter () {		// method that returns triangle perimeter 
		double side4 = Math.sqrt((side1 * side1) + (side2 * side2)); 
		double trianglePerimeter = side1 + side2 + side4;
		return trianglePerimeter;
	    }
	
	void printTriangleArea () {			// method that prints triangle area 
		System.out.println ("Triangle area is : " + TriangleArea());
	}
	
	void printTrianglePerimeter () {			// method that prints triangle perimeter 
		System.out.println ("Triangle perimeter is : " + TrianglePerimeter());
	}
	
}